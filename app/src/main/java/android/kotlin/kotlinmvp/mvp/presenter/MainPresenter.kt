package android.kotlin.kotlinmvp.mvp.presenter

import android.kotlin.kotlinmvp.R
import android.kotlin.kotlinmvp.mvp.model.CountersModel
import android.kotlin.kotlinmvp.mvp.view.MainView
import moxy.MvpPresenter

class MainPresenter(val model:CountersModel):MvpPresenter<MainView>() {

    fun counterOneClick() {
        val nextValue = model.next(0)
        viewState.setButtonOneText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(1)
        viewState.setButtonTwoText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(2)
        viewState.setButtonThreeText(nextValue.toString())
    }
}