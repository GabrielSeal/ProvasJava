package Provas;

public class terrestre extends veiculo {
    private boolean turbo;
    private double velMax;

    public double getVelMax()
    {
        if(this.turbo == true)
        {
            return velMax*1.2;
        }else 
        {
            return velMax;
        }
    }

    public void setTurbo(boolean turbo)
    {
        this.turbo = turbo;
    }

    public void setVelMax(double velMax)
    {
        this.velMax = velMax;
    }
}
