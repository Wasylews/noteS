package com.genius.wasylews.notes.presentation.main;

import com.arellomobile.mvp.InjectViewState;
import com.genius.wasylews.notes.presentation.base.BasePresenter;

import javax.inject.Inject;

@InjectViewState
public class MainPresenter extends BasePresenter<MainView> {

    @Inject
    public MainPresenter() {
        super();
    }
}
