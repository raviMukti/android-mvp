package id.application.mvpapp.contract;

import java.util.List;

import id.application.mvpapp.model.Friend;

public interface MainContract {
    interface View{
        void showFriend(List<Friend> friendList);
        void clearInput();
    }

    interface Interactor{
        void saveFriend(Friend friend);
        List<Friend> getAllFriendList();
    }

    interface Presenter{
        void saveFriend(Friend friend);
    }
}
