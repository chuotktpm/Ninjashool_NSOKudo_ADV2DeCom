
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_ei implements Runnable {
    private final Item a;
 
    Class_ei(Item var1) {
       this.a = var1;
    }
 
    public final void run() {
       GameScr.fg = true;
 
       try {
          for(int var1 = 0; var1 < this.a.quantity && Char.countNullSlot() > 0 && GameCanvas.ad instanceof GameScr; ++var1) {
             Service.getInstance().useItem(this.a.indexUI);
             Thread.sleep(20L);
          }
       } catch (InterruptedException var2) {
       }
 
       GameScr.fg = false;
    }
 }
 