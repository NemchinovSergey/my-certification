package interfaces;

/*
   modifier 'abstract' is redundant for interfaces
 */
public abstract interface Bounceable {

    /*
     * these are the same and they are public abstract void bounce();
     */
    void bounce();
//    public void bounce();
//    abstract void bounce();
//    abstract public void bounce();
//    public abstract void bounce();


    /*
     * final and abstract can never be used together,
     * and abstract is implied
     */
//    final void theImpossibleMethod();

    /*
     * interface methods are always public
     */
//    private void theImpossibleMethod();
//    protected void theImpossibleMethod();

}
