package demo.test.zj.mvpdemo.components.mvpdemo;

import demo.test.zj.mvpdemo.components.BasePresenter;
import demo.test.zj.mvpdemo.components.BaseView;

/**
 * Created by admin on 2017/10/13.
 */

public interface MvpdemoContract {

    interface Presenter extends BasePresenter{

    }

    interface View extends BaseView<MvpdemoContract.Presenter>{

    }

    interface Callback{

    }

}
