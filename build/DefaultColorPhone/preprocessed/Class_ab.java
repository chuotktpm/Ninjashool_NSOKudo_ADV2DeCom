
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_ab implements Runnable {
    Class_ab(Code var1) {
    }
 
    public final void run() {
       try {
          Char var1 = Char.getMyChar();
 
          for(int var2 = 0; var2 < var1.arrItemBag.length; ++var2) {
             Item var3;
             if (Code.isItemDel(var3 = var1.arrItemBag[var2])) {
                Service.getInstance().saleItem1(var3.indexUI, 1);
             }
          }
 
       } catch (Exception var4) {
          var4.printStackTrace();
       }
    }
 }
 