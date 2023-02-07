package Provas;

public class testaFuncoes {
    

    public static void main(String[] args) {
        
        aereo a1 = new aereo();
        a1.setMotores(5);
        a1.setVelMax(300);

        terrestre t1 = new terrestre();
        t1.setTurbo(false);
        t1.setVelMax(300);

        System.out.println("velocidade maxima terrestre é :" + t1.getVelMax());
        System.out.println("velocidade maxima aerea é :" +a1.getVelMax());
    }
}
