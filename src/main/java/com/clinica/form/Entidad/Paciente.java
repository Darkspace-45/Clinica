package com.clinica.form.Entidad;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Paciente {

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El correo electrónico es obligatorio")
    @Email(message = "Debe ingresar un correo electrónico válido")
    private String email;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "La fecha de nacimiento debe ser una fecha pasada")
    private Date fechaNacimiento;

    @NotBlank(message = "El género es obligatorio")
    private String genero;

    @NotBlank(message = "La dirección no puede estar vacía")
    @Size(min = 10, max = 150, message = "La dirección debe tener entre 10 y 150 caracteres")
    private String direccion; // Cambié "domicilio" a "direccion"

    @NotNull(message = "El ingreso anual es obligatorio")
    @Min(value = 6000, message = "El ingreso anual debe ser al menos $6,000")
    @Max(value = 200000, message = "El ingreso anual no puede exceder $200,000")
    private Long ingreso;

    @NotBlank(message = "El teléfono es obligatorio")
    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "El número de teléfono debe ser válido (mínimo 10 dígitos)")
    private String telefono;

    @NotNull(message = "Debe especificar si tiene alergias")
    private String Alergias;

    // Nuevos campos añadidos
    private String estadoCivil;

    @Size(max = 50, message = "La ocupación debe tener un máximo de 50 caracteres")
    private String ocupacion;

    @Size(max = 10, message = "El tipo de sangre debe tener un máximo de 10 caracteres")
    private String tipoSangre;

    @Size(max = 50, message = "El nombre del contacto de emergencia debe tener un máximo de 50 caracteres")
    private String contactoEmergencia;

    @Pattern(regexp = "^\\d{10}$", message = "El teléfono de emergencia debe tener 10 dígitos")
    private String telefonoEmergencia;

    @Size(max = 200, message = "Los antecedentes médicos deben tener un máximo de 200 caracteres")
    private String antecedentesMedicos;

    private Boolean discapacidad;

    @Size(max = 50, message = "El nombre del médico tratante debe tener un máximo de 50 caracteres")
    private String medicoTratante;

    @Size(max = 200, message = "Las observaciones deben tener un máximo de 200 caracteres")
    private String observaciones;

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getIngreso() {
        return ingreso;
    }

    public void setIngreso(Long ingreso) {
        this.ingreso = ingreso;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String alergias) {
        this.Alergias = alergias;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public String getAntecedentesMedicos() {
        return antecedentesMedicos;
    }

    public void setAntecedentesMedicos(String antecedentesMedicos) {
        this.antecedentesMedicos = antecedentesMedicos;
    }

    public Boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public String getMedicoTratante() {
        return medicoTratante;
    }

    public void setMedicoTratante(String medicoTratante) {
        this.medicoTratante = medicoTratante;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
