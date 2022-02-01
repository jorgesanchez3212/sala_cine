package jorge;

public class Color {

    //COLOR SÓLIDO
    public static final String RESET = "\u001B[0m";
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";
    //System.out.println(ROJO + "Texto en rojo." + RESET);

    //NEGRITA
    public static final String NEGRO_NEGRITA = "\033[1;30m";
    public static final String ROJO_NEGRITA = "\033[1;31m";
    public static final String VERDE_NEGRITA = "\033[1;32m";
    public static final String AMARILLO_NEGRITA = "\033[1;33m";
    public static final String AZUL_NEGRITA = "\033[1;34m";
    public static final String MORADO_NEGRITA = "\033[1;35m";
    public static final String CYAN_NEGRITA = "\033[1;36m";
    public static final String BLANCO_NEGRITA = "\033[1;37m";
    //System.out.println(ROJO_NEGRITA + "Texto en rojo y negrita." + RESET);

    //SUBRAYADO
    public static final String NEGRO_SUBR = "\033[4;30m";
    public static final String ROJO_SUB = "\033[4;31m";
    public static final String VERDE_SUB = "\033[4;32m";
    public static final String AMARILLO_SUB = "\033[4;33m";
    public static final String AZUL_SUB = "\033[4;34m";
    public static final String MORADO_SUB = "\033[4;35m";
    public static final String CYAN_SUB = "\033[4;36m";
    public static final String BLANCO_SUB = "\033[4;37m";
    //System.out.println(ROJO_SUB + "Texto en rojo subrayado." + RESET);

    //COLOR DE FONDO
    public static final String NEGRO_FONDO = "\033[40m";
    public static final String ROJO_FONDO = "\033[41m";
    public static final String VERDE_FONDO = "\033[42m";
    public static final String AMARILLO_FONDO = "\033[43m";
    public static final String AZUL_FONDO = "\033[44m";
    public static final String MORADO_FONDO = "\033[45m";
    public static final String CYAN_FONDO = "\033[46m";
    public static final String BLANCO_FONDO = "\033[47m";
    //System.out.println(ROJO_FONDO + "Texto en fondo rojo." + RESET);
}

