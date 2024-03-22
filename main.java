public class main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona.calcularIMC());
        System.out.println(persona.esMayorDeEdad());
        System.out.println(persona.getSexo());
        System.out.println(persona.toString());
    }
}