package demo.test.zj.mvpdemo.components.mvpdemo;

/**
 * Created by admin on 2017/10/13.
 */

public class MvpdemoPresenter implements MvpdemoContract.Presenter {

    private MvpdemoContract.View mView;
    private MvpdemoContract.Callback mCallback;
    private boolean isFirst = true;

    public MvpdemoPresenter(MvpdemoContract.View view,MvpdemoContract.Callback callback){
        this.mView = view;
        this.mCallback = callback;
        this.mView.setPresenter(this);
    }

    @Override
    public void start() {
        if(isFirst){
            isFirst = false;
        }
    }
}
