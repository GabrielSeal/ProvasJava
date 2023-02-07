package Provas;

public class veiculo {
    protected String fabricante;
    protected String modelo;
    protected String data;

    public void pegaModelo()
    {
        System.out.println("O modelo é: " + this.modelo + "o fabricante é :" + this.fabricante);
    }
}
