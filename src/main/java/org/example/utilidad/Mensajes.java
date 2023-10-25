package org.example.utilidad;

public enum Mensajes {
    NOMBRES_LONGITUD("El nombre no debe tener mas de 20 caracteres"),
    NOMBRES_FORMATO("El nombre no cumple los requisitos"),
    EDAD_LONGITUD("La edad no coincide, puedes contactarnos para la afiliacion a: 308261514"),
    EDAD_FORMATO("Solo se aceptan números"),
    BENEFICIARIO_LONGITUD("El beneficiario debe tener 50 caracteres"),
    BENEFICIARIO_FORMATO("No cumple los requisitos"),

    MONTOCOBERTURA_LONGITUD("El monto sobrepasa la cantidad"),
    MONTOCOBERTURA_FORMATO("Solo se aceptan números"),

    FECHAINICIOCOBERTURA_INVALIDA("no cumple con la fecha");

    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
