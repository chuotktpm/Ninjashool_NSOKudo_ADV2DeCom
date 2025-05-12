
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_dr implements Runnable {
    private final Item a;
 
    Class_dr(Item var1) {
       this.a = var1;
    }
 
    public final void run() {
       try {
          GameScr.getInstance().closeDialog();
          MyVector var7 = Char.getListItemByID(454);
          int var2 = var7.size();
          GameScr.itemSplit = this.a;
          if (var2 >= 20) {
             GameScr.cl = true;
             GameScr.arrItemTradeMe = new Item[24];
             int var3 = 0;
 
             for(int var4 = 0; var4 < 20; ++var4) {
                Item var9 = (Item)var7.elementAt(var7.size() - 1);
                GameScr.arrItemTradeMe[var3++] = var9;
                Char.getMyChar().arrItemBag[var9.indexUI] = null;
                var7.removeElementAt(var7.size() - 1);
             }
 
             Service.getInstance().c(GameScr.itemSplit, GameScr.arrItemTradeMe);
             Service.getInstance().viewInfo(Char.getMyChar().charFocus.charName);
             Auto.sleep(2000L);
          }
       } catch (Exception var10) {
          GameScr.chatPopup("Lỗi");
       }
 
    }
 }
 