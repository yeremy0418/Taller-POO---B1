public class persona {
    private String nombre;
    private int edad;
    private long cedula;
    private char sexo;
    private float peso;
    private float altura;


    public persona(String nombre, int edad, long cedula, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return 'H';
        } else {
            return sexo;
        }
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso="
                + peso + ", altura=" + altura + "]";
    }

public long generaCedula() {
        long cedula = 0;
        for (int i = 0; i < 10; i++) {
            cedula += (long) (Math.random());
        }
        return cedula;
    }
}
