package hust.linh.randomchat.Presenter;

import hust.linh.randomchat.Model.Mess;

/**
 * Created by duy on 2/14/2017.
 */

public interface ChatPresenterImp {
    void onSendButtonClick(Mess mess);
    void onConnect();
}
