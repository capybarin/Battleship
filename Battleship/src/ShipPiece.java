import java.awt.*;
import javax.swing.ImageIcon;

public class ShipPiece {
    private Image shipPieceAlive;
    private boolean shipIsDead;
    boolean isPlayer1;

    /*
     * конструктор который определяет к кому игроку принадлежит корабль
     * false это игрок 2, true это игрок 1
     */
    public ShipPiece(boolean isPlayer1) {
        this.isPlayer1 = isPlayer1;
        if (isPlayer1)
            shipPieceAlive = new ImageIcon("Player1.png").getImage();
        else
            shipPieceAlive = new ImageIcon("Player2.png").getImage();
        shipIsDead = false;
    }


    public void setShipImage(String file) {
        shipPieceAlive = new ImageIcon(file).getImage();

    }

    public Image getShipImage() {
        return shipPieceAlive;
    }


    public void destroy() {
        shipIsDead = true;
        if (isPlayer1) {
            setShipImage("Player1Hit.png");
        } else {
            setShipImage("Player2Hit.png");
        }
    }

    public boolean isDestroy() {
        return shipIsDead;
    }

}