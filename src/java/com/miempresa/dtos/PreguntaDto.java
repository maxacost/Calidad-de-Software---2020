/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.dtos;

/**
 *
 * @author Lenovo1
 */
public class PreguntaDto {

    private int id;
    private String anio, bimestre, curso, dificultad, pregunta;
    private String pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7, pregunta8, pregunta9, pregunta10, pregunta11, pregunta12, pregunta13, pregunta14, pregunta15, pregunta16, pregunta17, pregunta18, pregunta19, pregunta20;
    private int ide;

    public PreguntaDto(int ide ,String pregunta1, String pregunta2, String pregunta3, String pregunta4, String pregunta5, String pregunta6, String pregunta7, String pregunta8, String pregunta9,
            String pregunta10, String pregunta11, String pregunta12, String pregunta13, String pregunta14, String pregunta15,
            String pregunta16, String pregunta17, String pregunta18, String pregunta19, String pregunta20) {
        this.ide=ide;
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
        this.pregunta5 = pregunta5;
        this.pregunta6 = pregunta6;
        this.pregunta7 = pregunta7;
        this.pregunta8 = pregunta8;
        this.pregunta9 = pregunta9;
        this.pregunta10 = pregunta10;
        this.pregunta11 = pregunta11;
        this.pregunta12 = pregunta12;
        this.pregunta13 = pregunta13;
        this.pregunta14 = pregunta14;
        this.pregunta15 = pregunta15;
        this.pregunta16 = pregunta16;
        this.pregunta17 = pregunta17;
        this.pregunta18 = pregunta18;
        this.pregunta19 = pregunta19;
        this.pregunta20 = pregunta20;

    }

    public PreguntaDto(String pregunta1, String pregunta2, String pregunta3, String pregunta4, String pregunta5, String pregunta6, String pregunta7, String pregunta8, String pregunta9, String pregunta10, String pregunta11, String pregunta12, String pregunta13, String pregunta14, String pregunta15, String pregunta16, String pregunta17, String pregunta18, String pregunta19, String pregunta20) {
        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
        this.pregunta5 = pregunta5;
        this.pregunta6 = pregunta6;
        this.pregunta7 = pregunta7;
        this.pregunta8 = pregunta8;
        this.pregunta9 = pregunta9;
        this.pregunta10 = pregunta10;
        this.pregunta11 = pregunta11;
        this.pregunta12 = pregunta12;
        this.pregunta13 = pregunta13;
        this.pregunta14 = pregunta14;
        this.pregunta15 = pregunta15;
        this.pregunta16 = pregunta16;
        this.pregunta17 = pregunta17;
        this.pregunta18 = pregunta18;
        this.pregunta19 = pregunta19;
        this.pregunta20 = pregunta20;
    }

    public PreguntaDto() {
    }

    public PreguntaDto(String anio, String bimestre, String curso, String dificultad, String pregunta) {
        this.anio = anio;
        this.bimestre = bimestre;
        this.curso = curso;
        this.dificultad = dificultad;
        this.pregunta = pregunta;
    }

    public PreguntaDto(int id, String anio, String bimestre, String curso, String dificultad, String pregunta) {
        this.id = id;
        this.anio = anio;
        this.bimestre = bimestre;
        this.curso = curso;
        this.dificultad = dificultad;
        this.pregunta = pregunta;
    }

    public PreguntaDto(String anio, String bimestre, String curso, String dificultad, String pregunta, int id) {
        this.anio = anio;
        this.bimestre = bimestre;
        this.curso = curso;
        this.dificultad = dificultad;
        this.pregunta = pregunta;
        this.id = id;
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public String getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public String getPregunta5() {
        return pregunta5;
    }

    public void setPregunta5(String pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public String getPregunta6() {
        return pregunta6;
    }

    public void setPregunta6(String pregunta6) {
        this.pregunta6 = pregunta6;
    }

    public String getPregunta7() {
        return pregunta7;
    }

    public void setPregunta7(String pregunta7) {
        this.pregunta7 = pregunta7;
    }

    public String getPregunta8() {
        return pregunta8;
    }

    public void setPregunta8(String pregunta8) {
        this.pregunta8 = pregunta8;
    }

    public String getPregunta9() {
        return pregunta9;
    }

    public void setPregunta9(String pregunta9) {
        this.pregunta9 = pregunta9;
    }

    public String getPregunta10() {
        return pregunta10;
    }

    public void setPregunta10(String pregunta10) {
        this.pregunta10 = pregunta10;
    }

    public String getPregunta11() {
        return pregunta11;
    }

    public void setPregunta11(String pregunta11) {
        this.pregunta11 = pregunta11;
    }

    public String getPregunta12() {
        return pregunta12;
    }

    public void setPregunta12(String pregunta12) {
        this.pregunta12 = pregunta12;
    }

    public String getPregunta13() {
        return pregunta13;
    }

    public void setPregunta13(String pregunta13) {
        this.pregunta13 = pregunta13;
    }

    public String getPregunta14() {
        return pregunta14;
    }

    public void setPregunta14(String pregunta14) {
        this.pregunta14 = pregunta14;
    }

    public String getPregunta15() {
        return pregunta15;
    }

    public void setPregunta15(String pregunta15) {
        this.pregunta15 = pregunta15;
    }

    public String getPregunta16() {
        return pregunta16;
    }

    public void setPregunta16(String pregunta16) {
        this.pregunta16 = pregunta16;
    }

    public String getPregunta17() {
        return pregunta17;
    }

    public void setPregunta17(String pregunta17) {
        this.pregunta17 = pregunta17;
    }

    public String getPregunta18() {
        return pregunta18;
    }

    public void setPregunta18(String pregunta18) {
        this.pregunta18 = pregunta18;
    }

    public String getPregunta19() {
        return pregunta19;
    }

    public void setPregunta19(String pregunta19) {
        this.pregunta19 = pregunta19;
    }

    public String getPregunta20() {
        return pregunta20;
    }

    public void setPregunta20(String pregunta20) {
        this.pregunta20 = pregunta20;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}
