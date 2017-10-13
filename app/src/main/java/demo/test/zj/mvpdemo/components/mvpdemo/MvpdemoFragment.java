package demo.test.zj.mvpdemo.components.mvpdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.test.zj.mvpdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MvpdemoFragment extends Fragment implements MvpdemoContract.View  {

    private MvpdemoContract.Presenter mPresenter;

    public MvpdemoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mvpdemo, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if(this.mPresenter!=null)
            this.mPresenter.start();
    }

    @Override
    public void setPresenter(MvpdemoContract.Presenter presenter) {
        this.mPresenter = presenter;
    }


}
