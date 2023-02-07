package Provas;

public class aereo extends veiculo{
    private double nMotores;
    private double velMax;

    public double getVelMax()
    {
        return this.nMotores*this.velMax;
    }

    public void setMotores(double nMotores)
    {
        this.nMotores = nMotores;
    }

    public void setVelMax(double velMax)
    {
        this.velMax= velMax;
    }
}
