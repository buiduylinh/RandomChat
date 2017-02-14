package hust.linh.randomchat.Presenter;

import com.github.nkzawa.socketio.client.Socket;

import hust.linh.randomchat.View.ChatView;

/**
 * Created by duy on 2/14/2017.
 */

public class ChatPresenter implements ChatPresenterImp{
    ChatView chatView;
    Socket mSocket;
    public ChatPresenter(ChatView chatView){
        this.chatView=chatView;

    }

    @Override
    public void onSendButtonClick() {

    }

    @Override
    public void onConnect() {

    }
}
