package hust.linh.randomchat.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hust.linh.randomchat.Presenter.ChatPresenter;
import hust.linh.randomchat.R;

public class ChatActivity extends AppCompatActivity implements ChatView {
    ChatPresenter chatPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        chatPresenter = new ChatPresenter(this);
        chatPresenter.onConnect();
    }
    // view
    @Override
    public void updateListView() {

    }
}
