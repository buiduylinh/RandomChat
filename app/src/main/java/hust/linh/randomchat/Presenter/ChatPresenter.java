package hust.linh.randomchat.Presenter;

import com.github.nkzawa.emitter.Emitter;
import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

import hust.linh.randomchat.Model.Mess;
import hust.linh.randomchat.View.ChatView;

/**
 * Created by duy on 2/14/2017.
 */

public class ChatPresenter implements ChatPresenterImp {
    ChatView chatView;
    Socket mSocket;
    int pID;

    public ChatPresenter(ChatView chatView) {
        this.chatView = chatView;

    }

    @Override
    public void onSendButtonClick(Mess mess) {
        //send mess
        JSONObject obs = new JSONObject();
        try {
            obs.put("id",pID);
            obs.put("content",mess.getMess());
            mSocket.emit("chatting",obs);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onConnect() {
        try {
            mSocket = IO.socket("http://192.168.56.1:3000/");
//            mSocket = IO.socket("http://chatapp-95996.app.xervo.io/");
            mSocket.connect();
            mSocket.on("partnerid", onReceivepID);
            mSocket.on("nhantn", onReceivepMess);
        } catch (URISyntaxException e) {
        }
    }

    private Emitter.Listener onReceivepID = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            JSONObject data = (JSONObject) args[0];

            try {
                pID = Integer.parseInt(data.getString("id"));
                System.out.println(pID + "");
            } catch (JSONException e) {
                return;
            }

        }
    };
    private Emitter.Listener onReceivepMess = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            JSONObject data = (JSONObject) args[0];

            try {
                String content = data.getString("content");
                System.out.println(content);
            } catch (JSONException e) {
                return;
            }

        }
    };
}
