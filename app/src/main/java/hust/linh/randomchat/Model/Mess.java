package hust.linh.randomchat.Model;

/**
 * Created by duy on 2/14/2017.
 */

public class Mess {
    private int sendID;
    boolean isMyMess;

    public boolean isMyMess() {
        return isMyMess;
    }

    public void setMyMess(boolean myMess) {
        isMyMess = myMess;
    }

    public int getSendID() {
        return sendID;
    }

    public void setSendID(int sendID) {
        this.sendID = sendID;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    private String mess;
}
