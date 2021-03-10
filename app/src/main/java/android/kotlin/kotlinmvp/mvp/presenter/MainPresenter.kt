package android.kotlin.kotlinmvp.mvp.presenter

import android.kotlin.kotlinmvp.R
import android.kotlin.kotlinmvp.mvp.model.CountersModel
import android.kotlin.kotlinmvp.mvp.view.MainView

class MainPresenter(val view: MainView) {
    val model = CountersModel()

    fun counterOneClick() {
        val nextValue = model.next(0)
        view.setButtonOneText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(1)
        view.setButtonTwoText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(2)
        view.setButtonThreeText(nextValue.toString())
    }
}