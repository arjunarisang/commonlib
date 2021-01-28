package io.github.arjunarisang.commonlib.util.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.github.arjunarisang.commonlib.util.LocalDateTimeDeserializer;

import java.time.LocalDateTime;

public class UserProfile {

    private Integer idpegawai;
    private String nama;
    private String email;
    private String gelarDepan;
    private String gelarBelakang;
    private String tempatLahir;

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime tanggalLahir;

    private String kodeGolonganRuang;
    private String jenisJabatan;
    private String jabatan;
    private String organisasi;
    private String esl1;
    private String namaSatker;
    private String uriFoto;
    private String nip18;
    private String nip9;
    private String kodeGolongan;
    private String statusPegawai;
    private String esl2;
    private String esl3;
    private String esl4;
    private String esl5;
    private String kdSatker;
    private String jenisKelamin;
    private String agama;
    private String noKartuPegawai;
    private String npwp;
    private String alamatKtp;
    private String kodePosKtp;
    private String kodeOrganisasi;
    private String kodeIndukOrganisasi;
    private Integer grading;

    UserProfile(Integer idpegawai, String nama, String email, String gelarDepan, String gelarBelakang, String tempatLahir, LocalDateTime tanggalLahir, String kodeGolonganRuang, String jenisJabatan, String jabatan, String organisasi, String esl1, String namaSatker, String uriFoto, String nip18, String nip9, String kodeGolongan, String statusPegawai, String esl2, String esl3, String esl4, String esl5, String kdSatker, String jenisKelamin, String agama, String noKartuPegawai, String npwp, String alamatKtp, String kodePosKtp, String kodeOrganisasi, String kodeIndukOrganisasi, Integer grading) {
        this.idpegawai = idpegawai;
        this.nama = nama;
        this.email = email;
        this.gelarDepan = gelarDepan;
        this.gelarBelakang = gelarBelakang;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.kodeGolonganRuang = kodeGolonganRuang;
        this.jenisJabatan = jenisJabatan;
        this.jabatan = jabatan;
        this.organisasi = organisasi;
        this.esl1 = esl1;
        this.namaSatker = namaSatker;
        this.uriFoto = uriFoto;
        this.nip18 = nip18;
        this.nip9 = nip9;
        this.kodeGolongan = kodeGolongan;
        this.statusPegawai = statusPegawai;
        this.esl2 = esl2;
        this.esl3 = esl3;
        this.esl4 = esl4;
        this.esl5 = esl5;
        this.kdSatker = kdSatker;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.noKartuPegawai = noKartuPegawai;
        this.npwp = npwp;
        this.alamatKtp = alamatKtp;
        this.kodePosKtp = kodePosKtp;
        this.kodeOrganisasi = kodeOrganisasi;
        this.kodeIndukOrganisasi = kodeIndukOrganisasi;
        this.grading = grading;
    }

    public UserProfile() {
    }

    public static UserProfileBuilder builder() {
        return new UserProfileBuilder();
    }

    public Integer getIdpegawai() {
        return this.idpegawai;
    }

    public String getNama() {
        return this.nama;
    }

    public String getEmail() {
        return this.email;
    }

    public String getGelarDepan() {
        return this.gelarDepan;
    }

    public String getGelarBelakang() {
        return this.gelarBelakang;
    }

    public String getTempatLahir() {
        return this.tempatLahir;
    }

    public LocalDateTime getTanggalLahir() {
        return this.tanggalLahir;
    }

    public String getKodeGolonganRuang() {
        return this.kodeGolonganRuang;
    }

    public String getJenisJabatan() {
        return this.jenisJabatan;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public String getOrganisasi() {
        return this.organisasi;
    }

    public String getEsl1() {
        return this.esl1;
    }

    public String getNamaSatker() {
        return this.namaSatker;
    }

    public String getUriFoto() {
        return this.uriFoto;
    }

    public String getNip18() {
        return this.nip18;
    }

    public String getNip9() {
        return this.nip9;
    }

    public String getKodeGolongan() {
        return this.kodeGolongan;
    }

    public String getStatusPegawai() {
        return this.statusPegawai;
    }

    public String getEsl2() {
        return this.esl2;
    }

    public String getEsl3() {
        return this.esl3;
    }

    public String getEsl4() {
        return this.esl4;
    }

    public String getEsl5() {
        return this.esl5;
    }

    public String getKdSatker() {
        return this.kdSatker;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getAgama() {
        return this.agama;
    }

    public String getNoKartuPegawai() {
        return this.noKartuPegawai;
    }

    public String getNpwp() {
        return this.npwp;
    }

    public String getAlamatKtp() {
        return this.alamatKtp;
    }

    public String getKodePosKtp() {
        return this.kodePosKtp;
    }

    public String getKodeOrganisasi() {
        return this.kodeOrganisasi;
    }

    public String getKodeIndukOrganisasi() {
        return this.kodeIndukOrganisasi;
    }

    public Integer getGrading() {
        return this.grading;
    }

    public void setIdpegawai(Integer idpegawai) {
        this.idpegawai = idpegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGelarDepan(String gelarDepan) {
        this.gelarDepan = gelarDepan;
    }

    public void setGelarBelakang(String gelarBelakang) {
        this.gelarBelakang = gelarBelakang;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(LocalDateTime tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setKodeGolonganRuang(String kodeGolonganRuang) {
        this.kodeGolonganRuang = kodeGolonganRuang;
    }

    public void setJenisJabatan(String jenisJabatan) {
        this.jenisJabatan = jenisJabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setOrganisasi(String organisasi) {
        this.organisasi = organisasi;
    }

    public void setEsl1(String esl1) {
        this.esl1 = esl1;
    }

    public void setNamaSatker(String namaSatker) {
        this.namaSatker = namaSatker;
    }

    public void setUriFoto(String uriFoto) {
        this.uriFoto = uriFoto;
    }

    public void setNip18(String nip18) {
        this.nip18 = nip18;
    }

    public void setNip9(String nip9) {
        this.nip9 = nip9;
    }

    public void setKodeGolongan(String kodeGolongan) {
        this.kodeGolongan = kodeGolongan;
    }

    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }

    public void setEsl2(String esl2) {
        this.esl2 = esl2;
    }

    public void setEsl3(String esl3) {
        this.esl3 = esl3;
    }

    public void setEsl4(String esl4) {
        this.esl4 = esl4;
    }

    public void setEsl5(String esl5) {
        this.esl5 = esl5;
    }

    public void setKdSatker(String kdSatker) {
        this.kdSatker = kdSatker;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public void setNoKartuPegawai(String noKartuPegawai) {
        this.noKartuPegawai = noKartuPegawai;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public void setAlamatKtp(String alamatKtp) {
        this.alamatKtp = alamatKtp;
    }

    public void setKodePosKtp(String kodePosKtp) {
        this.kodePosKtp = kodePosKtp;
    }

    public void setKodeOrganisasi(String kodeOrganisasi) {
        this.kodeOrganisasi = kodeOrganisasi;
    }

    public void setKodeIndukOrganisasi(String kodeIndukOrganisasi) {
        this.kodeIndukOrganisasi = kodeIndukOrganisasi;
    }

    public void setGrading(Integer grading) {
        this.grading = grading;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserProfile)) return false;
        final UserProfile other = (UserProfile) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$idpegawai = this.getIdpegawai();
        final Object other$idpegawai = other.getIdpegawai();
        if (this$idpegawai == null ? other$idpegawai != null : !this$idpegawai.equals(other$idpegawai)) return false;
        final Object this$nama = this.getNama();
        final Object other$nama = other.getNama();
        if (this$nama == null ? other$nama != null : !this$nama.equals(other$nama)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$gelarDepan = this.getGelarDepan();
        final Object other$gelarDepan = other.getGelarDepan();
        if (this$gelarDepan == null ? other$gelarDepan != null : !this$gelarDepan.equals(other$gelarDepan))
            return false;
        final Object this$gelarBelakang = this.getGelarBelakang();
        final Object other$gelarBelakang = other.getGelarBelakang();
        if (this$gelarBelakang == null ? other$gelarBelakang != null : !this$gelarBelakang.equals(other$gelarBelakang))
            return false;
        final Object this$tempatLahir = this.getTempatLahir();
        final Object other$tempatLahir = other.getTempatLahir();
        if (this$tempatLahir == null ? other$tempatLahir != null : !this$tempatLahir.equals(other$tempatLahir))
            return false;
        final Object this$tanggalLahir = this.getTanggalLahir();
        final Object other$tanggalLahir = other.getTanggalLahir();
        if (this$tanggalLahir == null ? other$tanggalLahir != null : !this$tanggalLahir.equals(other$tanggalLahir))
            return false;
        final Object this$kodeGolonganRuang = this.getKodeGolonganRuang();
        final Object other$kodeGolonganRuang = other.getKodeGolonganRuang();
        if (this$kodeGolonganRuang == null ? other$kodeGolonganRuang != null : !this$kodeGolonganRuang.equals(other$kodeGolonganRuang))
            return false;
        final Object this$jenisJabatan = this.getJenisJabatan();
        final Object other$jenisJabatan = other.getJenisJabatan();
        if (this$jenisJabatan == null ? other$jenisJabatan != null : !this$jenisJabatan.equals(other$jenisJabatan))
            return false;
        final Object this$jabatan = this.getJabatan();
        final Object other$jabatan = other.getJabatan();
        if (this$jabatan == null ? other$jabatan != null : !this$jabatan.equals(other$jabatan)) return false;
        final Object this$organisasi = this.getOrganisasi();
        final Object other$organisasi = other.getOrganisasi();
        if (this$organisasi == null ? other$organisasi != null : !this$organisasi.equals(other$organisasi))
            return false;
        final Object this$esl1 = this.getEsl1();
        final Object other$esl1 = other.getEsl1();
        if (this$esl1 == null ? other$esl1 != null : !this$esl1.equals(other$esl1)) return false;
        final Object this$namaSatker = this.getNamaSatker();
        final Object other$namaSatker = other.getNamaSatker();
        if (this$namaSatker == null ? other$namaSatker != null : !this$namaSatker.equals(other$namaSatker))
            return false;
        final Object this$uriFoto = this.getUriFoto();
        final Object other$uriFoto = other.getUriFoto();
        if (this$uriFoto == null ? other$uriFoto != null : !this$uriFoto.equals(other$uriFoto)) return false;
        final Object this$nip18 = this.getNip18();
        final Object other$nip18 = other.getNip18();
        if (this$nip18 == null ? other$nip18 != null : !this$nip18.equals(other$nip18)) return false;
        final Object this$nip9 = this.getNip9();
        final Object other$nip9 = other.getNip9();
        if (this$nip9 == null ? other$nip9 != null : !this$nip9.equals(other$nip9)) return false;
        final Object this$kodeGolongan = this.getKodeGolongan();
        final Object other$kodeGolongan = other.getKodeGolongan();
        if (this$kodeGolongan == null ? other$kodeGolongan != null : !this$kodeGolongan.equals(other$kodeGolongan))
            return false;
        final Object this$statusPegawai = this.getStatusPegawai();
        final Object other$statusPegawai = other.getStatusPegawai();
        if (this$statusPegawai == null ? other$statusPegawai != null : !this$statusPegawai.equals(other$statusPegawai))
            return false;
        final Object this$esl2 = this.getEsl2();
        final Object other$esl2 = other.getEsl2();
        if (this$esl2 == null ? other$esl2 != null : !this$esl2.equals(other$esl2)) return false;
        final Object this$esl3 = this.getEsl3();
        final Object other$esl3 = other.getEsl3();
        if (this$esl3 == null ? other$esl3 != null : !this$esl3.equals(other$esl3)) return false;
        final Object this$esl4 = this.getEsl4();
        final Object other$esl4 = other.getEsl4();
        if (this$esl4 == null ? other$esl4 != null : !this$esl4.equals(other$esl4)) return false;
        final Object this$esl5 = this.getEsl5();
        final Object other$esl5 = other.getEsl5();
        if (this$esl5 == null ? other$esl5 != null : !this$esl5.equals(other$esl5)) return false;
        final Object this$kdSatker = this.getKdSatker();
        final Object other$kdSatker = other.getKdSatker();
        if (this$kdSatker == null ? other$kdSatker != null : !this$kdSatker.equals(other$kdSatker)) return false;
        final Object this$jenisKelamin = this.getJenisKelamin();
        final Object other$jenisKelamin = other.getJenisKelamin();
        if (this$jenisKelamin == null ? other$jenisKelamin != null : !this$jenisKelamin.equals(other$jenisKelamin))
            return false;
        final Object this$agama = this.getAgama();
        final Object other$agama = other.getAgama();
        if (this$agama == null ? other$agama != null : !this$agama.equals(other$agama)) return false;
        final Object this$noKartuPegawai = this.getNoKartuPegawai();
        final Object other$noKartuPegawai = other.getNoKartuPegawai();
        if (this$noKartuPegawai == null ? other$noKartuPegawai != null : !this$noKartuPegawai.equals(other$noKartuPegawai))
            return false;
        final Object this$npwp = this.getNpwp();
        final Object other$npwp = other.getNpwp();
        if (this$npwp == null ? other$npwp != null : !this$npwp.equals(other$npwp)) return false;
        final Object this$alamatKtp = this.getAlamatKtp();
        final Object other$alamatKtp = other.getAlamatKtp();
        if (this$alamatKtp == null ? other$alamatKtp != null : !this$alamatKtp.equals(other$alamatKtp)) return false;
        final Object this$kodePosKtp = this.getKodePosKtp();
        final Object other$kodePosKtp = other.getKodePosKtp();
        if (this$kodePosKtp == null ? other$kodePosKtp != null : !this$kodePosKtp.equals(other$kodePosKtp))
            return false;
        final Object this$kodeOrganisasi = this.getKodeOrganisasi();
        final Object other$kodeOrganisasi = other.getKodeOrganisasi();
        if (this$kodeOrganisasi == null ? other$kodeOrganisasi != null : !this$kodeOrganisasi.equals(other$kodeOrganisasi))
            return false;
        final Object this$kodeIndukOrganisasi = this.getKodeIndukOrganisasi();
        final Object other$kodeIndukOrganisasi = other.getKodeIndukOrganisasi();
        if (this$kodeIndukOrganisasi == null ? other$kodeIndukOrganisasi != null : !this$kodeIndukOrganisasi.equals(other$kodeIndukOrganisasi))
            return false;
        final Object this$grading = this.getGrading();
        final Object other$grading = other.getGrading();
        if (this$grading == null ? other$grading != null : !this$grading.equals(other$grading)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserProfile;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $idpegawai = this.getIdpegawai();
        result = result * PRIME + ($idpegawai == null ? 43 : $idpegawai.hashCode());
        final Object $nama = this.getNama();
        result = result * PRIME + ($nama == null ? 43 : $nama.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $gelarDepan = this.getGelarDepan();
        result = result * PRIME + ($gelarDepan == null ? 43 : $gelarDepan.hashCode());
        final Object $gelarBelakang = this.getGelarBelakang();
        result = result * PRIME + ($gelarBelakang == null ? 43 : $gelarBelakang.hashCode());
        final Object $tempatLahir = this.getTempatLahir();
        result = result * PRIME + ($tempatLahir == null ? 43 : $tempatLahir.hashCode());
        final Object $tanggalLahir = this.getTanggalLahir();
        result = result * PRIME + ($tanggalLahir == null ? 43 : $tanggalLahir.hashCode());
        final Object $kodeGolonganRuang = this.getKodeGolonganRuang();
        result = result * PRIME + ($kodeGolonganRuang == null ? 43 : $kodeGolonganRuang.hashCode());
        final Object $jenisJabatan = this.getJenisJabatan();
        result = result * PRIME + ($jenisJabatan == null ? 43 : $jenisJabatan.hashCode());
        final Object $jabatan = this.getJabatan();
        result = result * PRIME + ($jabatan == null ? 43 : $jabatan.hashCode());
        final Object $organisasi = this.getOrganisasi();
        result = result * PRIME + ($organisasi == null ? 43 : $organisasi.hashCode());
        final Object $esl1 = this.getEsl1();
        result = result * PRIME + ($esl1 == null ? 43 : $esl1.hashCode());
        final Object $namaSatker = this.getNamaSatker();
        result = result * PRIME + ($namaSatker == null ? 43 : $namaSatker.hashCode());
        final Object $uriFoto = this.getUriFoto();
        result = result * PRIME + ($uriFoto == null ? 43 : $uriFoto.hashCode());
        final Object $nip18 = this.getNip18();
        result = result * PRIME + ($nip18 == null ? 43 : $nip18.hashCode());
        final Object $nip9 = this.getNip9();
        result = result * PRIME + ($nip9 == null ? 43 : $nip9.hashCode());
        final Object $kodeGolongan = this.getKodeGolongan();
        result = result * PRIME + ($kodeGolongan == null ? 43 : $kodeGolongan.hashCode());
        final Object $statusPegawai = this.getStatusPegawai();
        result = result * PRIME + ($statusPegawai == null ? 43 : $statusPegawai.hashCode());
        final Object $esl2 = this.getEsl2();
        result = result * PRIME + ($esl2 == null ? 43 : $esl2.hashCode());
        final Object $esl3 = this.getEsl3();
        result = result * PRIME + ($esl3 == null ? 43 : $esl3.hashCode());
        final Object $esl4 = this.getEsl4();
        result = result * PRIME + ($esl4 == null ? 43 : $esl4.hashCode());
        final Object $esl5 = this.getEsl5();
        result = result * PRIME + ($esl5 == null ? 43 : $esl5.hashCode());
        final Object $kdSatker = this.getKdSatker();
        result = result * PRIME + ($kdSatker == null ? 43 : $kdSatker.hashCode());
        final Object $jenisKelamin = this.getJenisKelamin();
        result = result * PRIME + ($jenisKelamin == null ? 43 : $jenisKelamin.hashCode());
        final Object $agama = this.getAgama();
        result = result * PRIME + ($agama == null ? 43 : $agama.hashCode());
        final Object $noKartuPegawai = this.getNoKartuPegawai();
        result = result * PRIME + ($noKartuPegawai == null ? 43 : $noKartuPegawai.hashCode());
        final Object $npwp = this.getNpwp();
        result = result * PRIME + ($npwp == null ? 43 : $npwp.hashCode());
        final Object $alamatKtp = this.getAlamatKtp();
        result = result * PRIME + ($alamatKtp == null ? 43 : $alamatKtp.hashCode());
        final Object $kodePosKtp = this.getKodePosKtp();
        result = result * PRIME + ($kodePosKtp == null ? 43 : $kodePosKtp.hashCode());
        final Object $kodeOrganisasi = this.getKodeOrganisasi();
        result = result * PRIME + ($kodeOrganisasi == null ? 43 : $kodeOrganisasi.hashCode());
        final Object $kodeIndukOrganisasi = this.getKodeIndukOrganisasi();
        result = result * PRIME + ($kodeIndukOrganisasi == null ? 43 : $kodeIndukOrganisasi.hashCode());
        final Object $grading = this.getGrading();
        result = result * PRIME + ($grading == null ? 43 : $grading.hashCode());
        return result;
    }

    public String toString() {
        return "UserProfile(idpegawai=" + this.getIdpegawai() + ", nama=" + this.getNama() + ", email=" + this.getEmail() + ", gelarDepan=" + this.getGelarDepan() + ", gelarBelakang=" + this.getGelarBelakang() + ", tempatLahir=" + this.getTempatLahir() + ", tanggalLahir=" + this.getTanggalLahir() + ", kodeGolonganRuang=" + this.getKodeGolonganRuang() + ", jenisJabatan=" + this.getJenisJabatan() + ", jabatan=" + this.getJabatan() + ", organisasi=" + this.getOrganisasi() + ", esl1=" + this.getEsl1() + ", namaSatker=" + this.getNamaSatker() + ", uriFoto=" + this.getUriFoto() + ", nip18=" + this.getNip18() + ", nip9=" + this.getNip9() + ", kodeGolongan=" + this.getKodeGolongan() + ", statusPegawai=" + this.getStatusPegawai() + ", esl2=" + this.getEsl2() + ", esl3=" + this.getEsl3() + ", esl4=" + this.getEsl4() + ", esl5=" + this.getEsl5() + ", kdSatker=" + this.getKdSatker() + ", jenisKelamin=" + this.getJenisKelamin() + ", agama=" + this.getAgama() + ", noKartuPegawai=" + this.getNoKartuPegawai() + ", npwp=" + this.getNpwp() + ", alamatKtp=" + this.getAlamatKtp() + ", kodePosKtp=" + this.getKodePosKtp() + ", kodeOrganisasi=" + this.getKodeOrganisasi() + ", kodeIndukOrganisasi=" + this.getKodeIndukOrganisasi() + ", grading=" + this.getGrading() + ")";
    }

    public static class UserProfileBuilder {
        private Integer idpegawai;
        private String nama;
        private String email;
        private String gelarDepan;
        private String gelarBelakang;
        private String tempatLahir;
        private LocalDateTime tanggalLahir;
        private String kodeGolonganRuang;
        private String jenisJabatan;
        private String jabatan;
        private String organisasi;
        private String esl1;
        private String namaSatker;
        private String uriFoto;
        private String nip18;
        private String nip9;
        private String kodeGolongan;
        private String statusPegawai;
        private String esl2;
        private String esl3;
        private String esl4;
        private String esl5;
        private String kdSatker;
        private String jenisKelamin;
        private String agama;
        private String noKartuPegawai;
        private String npwp;
        private String alamatKtp;
        private String kodePosKtp;
        private String kodeOrganisasi;
        private String kodeIndukOrganisasi;
        private Integer grading;

        UserProfileBuilder() {
        }

        public UserProfile.UserProfileBuilder idpegawai(Integer idpegawai) {
            this.idpegawai = idpegawai;
            return this;
        }

        public UserProfile.UserProfileBuilder nama(String nama) {
            this.nama = nama;
            return this;
        }

        public UserProfile.UserProfileBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserProfile.UserProfileBuilder gelarDepan(String gelarDepan) {
            this.gelarDepan = gelarDepan;
            return this;
        }

        public UserProfile.UserProfileBuilder gelarBelakang(String gelarBelakang) {
            this.gelarBelakang = gelarBelakang;
            return this;
        }

        public UserProfile.UserProfileBuilder tempatLahir(String tempatLahir) {
            this.tempatLahir = tempatLahir;
            return this;
        }

        public UserProfile.UserProfileBuilder tanggalLahir(LocalDateTime tanggalLahir) {
            this.tanggalLahir = tanggalLahir;
            return this;
        }

        public UserProfile.UserProfileBuilder kodeGolonganRuang(String kodeGolonganRuang) {
            this.kodeGolonganRuang = kodeGolonganRuang;
            return this;
        }

        public UserProfile.UserProfileBuilder jenisJabatan(String jenisJabatan) {
            this.jenisJabatan = jenisJabatan;
            return this;
        }

        public UserProfile.UserProfileBuilder jabatan(String jabatan) {
            this.jabatan = jabatan;
            return this;
        }

        public UserProfile.UserProfileBuilder organisasi(String organisasi) {
            this.organisasi = organisasi;
            return this;
        }

        public UserProfile.UserProfileBuilder esl1(String esl1) {
            this.esl1 = esl1;
            return this;
        }

        public UserProfile.UserProfileBuilder namaSatker(String namaSatker) {
            this.namaSatker = namaSatker;
            return this;
        }

        public UserProfile.UserProfileBuilder uriFoto(String uriFoto) {
            this.uriFoto = uriFoto;
            return this;
        }

        public UserProfile.UserProfileBuilder nip18(String nip18) {
            this.nip18 = nip18;
            return this;
        }

        public UserProfile.UserProfileBuilder nip9(String nip9) {
            this.nip9 = nip9;
            return this;
        }

        public UserProfile.UserProfileBuilder kodeGolongan(String kodeGolongan) {
            this.kodeGolongan = kodeGolongan;
            return this;
        }

        public UserProfile.UserProfileBuilder statusPegawai(String statusPegawai) {
            this.statusPegawai = statusPegawai;
            return this;
        }

        public UserProfile.UserProfileBuilder esl2(String esl2) {
            this.esl2 = esl2;
            return this;
        }

        public UserProfile.UserProfileBuilder esl3(String esl3) {
            this.esl3 = esl3;
            return this;
        }

        public UserProfile.UserProfileBuilder esl4(String esl4) {
            this.esl4 = esl4;
            return this;
        }

        public UserProfile.UserProfileBuilder esl5(String esl5) {
            this.esl5 = esl5;
            return this;
        }

        public UserProfile.UserProfileBuilder kdSatker(String kdSatker) {
            this.kdSatker = kdSatker;
            return this;
        }

        public UserProfile.UserProfileBuilder jenisKelamin(String jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
            return this;
        }

        public UserProfile.UserProfileBuilder agama(String agama) {
            this.agama = agama;
            return this;
        }

        public UserProfile.UserProfileBuilder noKartuPegawai(String noKartuPegawai) {
            this.noKartuPegawai = noKartuPegawai;
            return this;
        }

        public UserProfile.UserProfileBuilder npwp(String npwp) {
            this.npwp = npwp;
            return this;
        }

        public UserProfile.UserProfileBuilder alamatKtp(String alamatKtp) {
            this.alamatKtp = alamatKtp;
            return this;
        }

        public UserProfile.UserProfileBuilder kodePosKtp(String kodePosKtp) {
            this.kodePosKtp = kodePosKtp;
            return this;
        }

        public UserProfile.UserProfileBuilder kodeOrganisasi(String kodeOrganisasi) {
            this.kodeOrganisasi = kodeOrganisasi;
            return this;
        }

        public UserProfile.UserProfileBuilder kodeIndukOrganisasi(String kodeIndukOrganisasi) {
            this.kodeIndukOrganisasi = kodeIndukOrganisasi;
            return this;
        }

        public UserProfile.UserProfileBuilder grading(Integer grading) {
            this.grading = grading;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(idpegawai, nama, email, gelarDepan, gelarBelakang, tempatLahir, tanggalLahir, kodeGolonganRuang, jenisJabatan, jabatan, organisasi, esl1, namaSatker, uriFoto, nip18, nip9, kodeGolongan, statusPegawai, esl2, esl3, esl4, esl5, kdSatker, jenisKelamin, agama, noKartuPegawai, npwp, alamatKtp, kodePosKtp, kodeOrganisasi, kodeIndukOrganisasi, grading);
        }

        public String toString() {
            return "UserProfile.UserProfileBuilder(idpegawai=" + this.idpegawai + ", nama=" + this.nama + ", email=" + this.email + ", gelarDepan=" + this.gelarDepan + ", gelarBelakang=" + this.gelarBelakang + ", tempatLahir=" + this.tempatLahir + ", tanggalLahir=" + this.tanggalLahir + ", kodeGolonganRuang=" + this.kodeGolonganRuang + ", jenisJabatan=" + this.jenisJabatan + ", jabatan=" + this.jabatan + ", organisasi=" + this.organisasi + ", esl1=" + this.esl1 + ", namaSatker=" + this.namaSatker + ", uriFoto=" + this.uriFoto + ", nip18=" + this.nip18 + ", nip9=" + this.nip9 + ", kodeGolongan=" + this.kodeGolongan + ", statusPegawai=" + this.statusPegawai + ", esl2=" + this.esl2 + ", esl3=" + this.esl3 + ", esl4=" + this.esl4 + ", esl5=" + this.esl5 + ", kdSatker=" + this.kdSatker + ", jenisKelamin=" + this.jenisKelamin + ", agama=" + this.agama + ", noKartuPegawai=" + this.noKartuPegawai + ", npwp=" + this.npwp + ", alamatKtp=" + this.alamatKtp + ", kodePosKtp=" + this.kodePosKtp + ", kodeOrganisasi=" + this.kodeOrganisasi + ", kodeIndukOrganisasi=" + this.kodeIndukOrganisasi + ", grading=" + this.grading + ")";
        }
    }
}
