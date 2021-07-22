package id.application.mvpapp.interactor;

import java.util.ArrayList;
import java.util.List;

import id.application.mvpapp.contract.MainContract;
import id.application.mvpapp.model.Friend;

public class MainInteractorImpl implements MainContract.Interactor {

    private List<Friend> friendList = new ArrayList<>();

    @Override
    public void saveFriend(Friend friend) {
        friendList.add(friend);
    }

    @Override
    public List<Friend> getAllFriendList() {
        return friendList;
    }
}
