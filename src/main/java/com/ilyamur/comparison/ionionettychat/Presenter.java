package com.ilyamur.comparison.ionionettychat;

interface Presenter {

    void eventInitialized();

    void eventChangedA();

    void eventChangedB();

    void eventChangedLine();

    //

    void updateComputeSumSuccess();

    void updateComputeSumFailure();

    void updateComputeProductSuccess();

    void updateComputeProductFailure();

    void updateComputeLineLength();
}
