package id.application.mvpapp.presenter;

import id.application.mvpapp.contract.MainContract;
import id.application.mvpapp.interactor.MainInteractorImpl;
import id.application.mvpapp.model.Friend;

public class MainPresenterImpl implements MainContract.Presenter {

    private MainContract.View mainView;
    private MainContract.Interactor mainInteractor;

    public MainPresenterImpl(MainContract.View mainView) {
        this.mainView = mainView;
        this.mainInteractor = new MainInteractorImpl();
    }

    @Override
    public void saveFriend(Friend friend) {
        mainInteractor.saveFriend(friend);
        mainView.showFriend(mainInteractor.getAllFriendList());
        mainView.clearInput();
    }
}
