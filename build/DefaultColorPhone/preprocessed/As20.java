
public class As20 extends As10 {
    private int a;
    private static final int[] b = new int[]{0, 1, 1, 72, 72, 27, 27};
    private static final int[] c = new int[]{0, 9, 9, 10, 10, 11, 11};
    private static final int[] d = new int[]{0, 0, 1, 0, 1, 0, 1};
    private static final int[] e = new int[]{0, 94, 114, 99, 109, 105, 119};
    private static final int[] f = new int[]{-1, 40, 49, 58, 67, 76, 85};
    private static final int[] ab = new int[]{-1, 41, 50, 59, 68, 77, 86};
    private static final int[] ac = new int[]{-1, 42, 51, 60, 69, 78, 87};
 
    public As20(int var1) {
       super.a();
       this.a = var1;
    }
 
    public boolean a(Char var1) {
       return var1.cLevel >= 100;
    }
 
    public void a(Char var1, byte var2, byte var3) {
       if (var1.ctaskId < 9) {
          super.a(var1, (byte)var2, (byte)var3);
       } else {
           try {
               int var4;
               int var5;
               Item var6;
               int var7;
               int var9;
               int var11;
               Char var12;
               Class_cq var13;
               Skill var14;
               Item var15;
               int var24;
               int var27;
               Item var31;
               Code var36;
               switch (var1.ctaskId) {
                   case 9:
                       if (var1.nClass.classId != 0) {
                           if (TileMap.mapID == 28) {
                               this.c(-1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(28, -1, -1, -1);
                           return;
                       }
                       
                       if (this.a == 0) {
                           GameScr.chatPopup("Hãy vào lớp!");
                           var36 = Code.a;
                           Code.f();
                           return;
                       }
                       
                       var4 = b[this.a];
                       if (TileMap.mapID != var4) {
                           this.a(var4, -2, -1, -1);
                           return;
                       }
                       
                       GameScr.PickNpc(5, 1, 0);
                       
                       for(var5 = 0; var5 < var1.arrItemBag.length; ++var5) {
                           if ((var15 = var1.arrItemBag[var5]) != null && (var15.template.type == 22 || var15.template.type == 27)) {
                               Service.getInstance().useItem(var15.indexUI);
                           }
                       }
                       
                       Thread.sleep(1000L);
                       if ((var31 = var1.arrItemBody[1]) != null) {
                           Service.getInstance().b(var31.template.type);
                           LockGame.q();
                       }
                       
                       GameScr.PickNpc(c[this.a], 1, d[this.a]);
                       
                       do {
                           Thread.sleep(1000L);
                       } while(Char.g(e[this.a]) == null);
                       
                       if ((var31 = Char.g(f[this.a])) != null) {
                           Service.getInstance().useItem(var31.indexUI);
                       }
                       
                       if ((var31 = Char.g(e[this.a])) != null) {
                           Service.getInstance().useItem(var31.indexUI);
                       }
                       
                       Thread.sleep(1000L);
                       GameScr.PickNpc(4, 0, 0);
                       
                       for(var2 = 0; var2 < var1.arrItemBag.length; ++var2) {
                           if ((var31 = var1.arrItemBag[var2]) != null && (var31.template.type < 10 || var31.template.type == 16 || var31.template.type == 17 || var31.template.id == 23)) {
                               Service.getInstance().saleItem1(var31.indexUI, var31.indexUI);
                           }
                       }
                       
                       Service.getInstance().bagSort();
                       LockGame.s();
                       return;
                   case 10:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 28) {
                               this.c(-1);
                               this.c(5, 1);
                               return;
                           }
                           
                           this.a(28, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 4) {
                               this.c(-1);
                               this.c(6, 1);
                               return;
                           }
                           
                           this.a(4, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 46) {
                               this.c(-1);
                               this.c(7, 1);
                               return;
                           }
                           
                           this.a(46, -1, -1, -1);
                           return;
                       }
                       break;
                   case 11:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 28) {
                               this.c(-1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(28, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a != 1) {
                           break;
                       }
                       
                       for(var4 = 0; var4 < GameScr.vCharInMap.size(); ++var4) {
                           Char var33;
                           if ((var33 = (Char)GameScr.vCharInMap.elementAt(var4)) != null) {
                               Service.getInstance().addFriend(var33.charName);
                           }
                       }
                       
                       var2 = (byte) super.i;
                       GameScr var28 = GameScr.getInstance();
                       Npc var32;
                       if ((var32 = GameScr.i(13)) == null || var32.r == 15) {
                           super.i = TileMap.zoneID;
                           return;
                       }
                       
                       if (Math.abs(var32.cx - Char.getMyChar().cx) > 22 || Math.abs(var32.cy - Char.getMyChar().cy) > 22) {
                           Char.c(var32.cx, var32.cy);
                       }
                       
                       Service.getInstance().openUIZone();
                       LockGame.e();
                       var4 = -1;
                       if (var2 < 0) {
                           var2 = (byte) (var28.zones.length - 1);
                       } else if (var2 >= var28.zones.length) {
                           var2 = 0;
                       }
                       
                       var5 = 0;
                       
                       for(var24 = (var2 + 1) % var28.zones.length; var24 != var2; var24 = (var24 + 1) % var28.zones.length) {
                           if (var28.zones[var24] < 20 && var28.zones[var24] > var5) {
                               var4 = var24;
                               var5 = var28.zones[var24];
                           }
                       }
                       
                       super.i = var4;
                       Service.getInstance().a(var4, -1);
                       TileMap.g();
                       Thread.sleep(100L);
                       break;
                   case 12:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 3) {
                               this.c(-1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(3, -1, -1, -1);
                           return;
                       }
                       
                       boolean var20 = false;
                       var5 = -1;
                       var15 = null;
                       if (var1.taskMaint.a == 1) {
                           var20 = true;
                           var5 = (new int[]{194, 94, 114, 99, 109, 105, 119})[var1.nClass.classId];
                           if ((var15 = var1.arrItemBody[1]) == null) {
                               var20 = false;
                               var15 = Char.g(var5);
                           }
                       } else if (var1.taskMaint.a == 2) {
                           var20 = true;
                           var5 = 174;
                           if ((var15 = var1.arrItemBody[9]) == null) {
                               var20 = false;
                               var15 = Char.g(174);
                           }
                       } else if (var1.taskMaint.a == 3) {
                           var20 = true;
                           var5 = var1.cgender == 1 ? 124 : 125;
                           if ((var15 = var1.arrItemBody[8]) == null) {
                               var20 = false;
                               var15 = Char.g(var5);
                           }
                       }
                       
                       if (var15 == null) {
                           if (TileMap.mapID == 4) {
                               this.c(var5);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(4, -1, -1, -1);
                           return;
                       }
                       
                       var3 = 0;
                       var24 = 0;
                       if (var15.isTypeClothe()) {
                           var3 = (byte) (GameScr.upClothe[var15.upgrade] / 2);
                           var24 = GameScr.coinUpClothes[var15.upgrade];
                       } else if (var15.isTypeAdorn()) {
                           var3 = (byte) (GameScr.upAdorn[var15.upgrade] / 2);
                           var24 = GameScr.coinUpAdorns[var15.upgrade];
                       } else if (var15.isTypeWeapon()) {
                           var3 = (byte) (GameScr.upWeapon[var15.upgrade] / 2);
                           var24 = GameScr.coinUpWeapons[var15.upgrade];
                       }
                       
                       if (var3 << 1 > Char.af() || var24 << 1 > var1.yen) {
                           if (TileMap.mapID == 46) {
                               this.c(1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(46, -1, -1, -1);
                           return;
                       }
                       
                       if (TileMap.mapID != 22) {
                           this.a(22, -2, -1, -1);
                           return;
                       }
                       
                       if (var20) {
                           Service.getInstance().b(var15.template.type);
                           LockGame.q();
                       }
                       
                       var7 = var15.upgrade;
                       GameScr.PickNpc(6, 0, 0);
                       LockGame.q();
                       GameScr.itemUpGrade = var15;
                       
                       for(var27 = 0; var27 < 2 && var15.upgrade == var7; ++var27) {
                           GameScr.arrItemUpGrade = new Item[18];
                           var9 = 0;
                           int var30 = 0;
                           
                           for(var4 = 0; var4 < var1.arrItemBag.length && var30 < var3; ++var4) {
                               if ((var31 = var1.arrItemBag[var4]) != null && var31.template.type == 26 && var31.template.id <= 3) {
                                   var1.arrItemBag[var4] = null;
                                   GameScr.arrItemUpGrade[var9++] = var31;
                                   var30 += GameScr.upClothe[var31.template.id];
                               }
                           }
                           
                           do {
                               try {
                                   Thread.sleep(3000L);
                                   Service.getInstance().upgradeItem1(var15, GameScr.arrItemUpGrade, false);
                                   LockGame.q();
                               } catch (InterruptedException ex) {
                                   
                               }
                           } while(GameScr.arrItemUpGrade[0] != null);
                       }
                       
                       GameScr.itemUpGrade = null;
                       Service.getInstance().useItem(var15.indexUI);
                       if (var15.upgrade > var7) {
                           LockGame.o();
                           return;
                       }
                       break;
                   case 13:
                       Item var18;
                       if ((var18 = var1.arrItemBody[1]) != null && var18.upgrade < 2) {
                           var5 = GameScr.upWeapon[var18.upgrade] / 2;
                           var2 = (byte) GameScr.coinUpWeapons[var18.upgrade];
                           if (var5 << 1 <= Char.af() && var2 << 1 <= var1.yen) {
                               if (TileMap.mapID != 22) {
                                   this.a(22, -2, -1, -1);
                                   return;
                               }
                               
                               Service.getInstance().b(var18.template.type);
                               LockGame.q();
                               var3 = (byte) var18.upgrade;
                               GameScr.PickNpc(6, 0, 0);
                               LockGame.q();
                               GameScr.itemUpGrade = var18;
                               
                               for(var24 = 0; var24 < 2 && var18.upgrade == var3; ++var24) {
                                   GameScr.arrItemUpGrade = new Item[18];
                                   var7 = 0;
                                   var27 = 0;
                                   
                                   for(var9 = 0; var9 < var1.arrItemBag.length && var27 < var5; ++var9) {
                                       Item var10;
                                       if ((var10 = var1.arrItemBag[var9]) != null && var10.template.type == 26 && var10.template.id <= 3) {
                                           var1.arrItemBag[var9] = null;
                                           GameScr.arrItemUpGrade[var7++] = var10;
                                           var27 += GameScr.upClothe[var10.template.id];
                                       }
                                   }
                                   
                                   do {
                                       Thread.sleep(3000L);
                                       Service.getInstance().upgradeItem(var18, GameScr.arrItemUpGrade, false);
                                       LockGame.q();
                                   } while(GameScr.arrItemUpGrade[0] != null);
                               }
                               
                               GameScr.itemUpGrade = null;
                               Service.getInstance().useItem(var18.indexUI);
                               return;
                           }
                           
                           if (TileMap.mapID == 4) {
                               this.c(1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(4, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 4) {
                               this.c(-1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(4, -1, -1, -1);
                           return;
                       }
                       
                       var5 = var1.taskMaint.a == 1 ? 56 : (var1.taskMaint.a == 2 ? 0 : 73);
                       if (TileMap.mapID != var5) {
                           return;
                       }
                       
                       if (var1.cHP < var1.cMaxHP / 2 && var1.cHP > 0) {
                           var1.e(16);
                       }
                       
                       if (var1.cMP < var1.cMaxMP / 2 && var1.cHP > 0) {
                           var1.e(17);
                       }
                       
                       if (GameScr.vCharInMap.size() > 0 && (var12 = (Char)GameScr.vCharInMap.elementAt(0)) != null) {
                           var14 = Auto.selectSkill;
                           if (Class_fa.e(var1.cx - var12.cx) > var14.dx || Class_fa.e(var1.cy - var12.cy) > var14.dy) {
                               Char.c(var12.cx < TileMap.c ? var12.cx : TileMap.c - 50, var12.cy);
                           }
                           
                           Auto.v.removeAllElements();
                           Auto.w.removeAllElements();
                           Auto.w.addElement(var12);
                           Service.getInstance().a(Auto.v, Auto.w, 1);
                           if (System.currentTimeMillis() - var14.lastTimeUseThisSkill >= (long)var14.coolDown) {
                               var14.lastTimeUseThisSkill = System.currentTimeMillis();
                               var14.paintCanNotUseSkill = true;
                               var1.b(GameScr.skillPaints[var14.template.id], 0);
                               return;
                           }
                       }
                       break;
                   case 14:
                       if (var1.cLevel >= 15 && (var15 = Char.g(ab[var1.nClass.classId])) != null) {
                           GameScr.chatPopup("Học sách kĩ năng");
                           Service.getInstance().useItem(var15.indexUI);
                           Thread.sleep(1000L);
                       }
                       
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 29) {
                               this.c(-1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(29, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 29 && super.i == TileMap.zoneID) {
                               var5 = Code.l < 0 ? -1 : Code.l * Code.l;
                               ItemMap var16 = null;
                               
                               for(var3 = 0; var3 < GameScr.af.size(); ++var3) {
                                   ItemMap var29;
                                   var7 = Math.abs((var29 = (ItemMap)GameScr.af.elementAt(var3)).a - var1.cx);
                                   var27 = Math.abs(var29.b - var1.cy);
                                   var9 = var7 * var7 + var27 * var27;
                                   if (!var29.k && var29.h.id == 212 && (Char.countNullSlot() > 2 || Char.hasItem(212)) && (var5 < 0 || var9 < var5)) {
                                       var5 = var9;
                                       var16 = var29;
                                   }
                               }
                               
                               if (var16 == null) {
                                   super.i = (super.i + 1) % 30;
                                   return;
                               }
                               
                               Char.c(var16.c, var16.d);
                               Service.getInstance().pickItem(var16.g);
                               
                               for(var3 = 0; var3 < 5 && !LockGame.c(); ++var3) {
                               }
                               
                               var16.k = true;
                               return;
                           }
                           
                           this.a(29, super.i, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 40) {
                               this.c(15, 1);
                               this.c(213);
                               return;
                           }
                           
                           this.a(40, -1, -1, -1);
                           return;
                       }
                       break;
                   case 15:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 8) {
                               this.c(-1);
                               this.c(-1, 1);
                               return;
                           }
                           
                           this.a(8, -1, -1, -1);
                           return;
                       }
                       
                       if (TileMap.mapID != var2) {
                           super.a(var2, -2, -1, -1);
                           return;
                       }
                       
                       GameScr.PickNpc(var3, 0, 0);
                       LockGame.o();
                       Auto.tuSat();
                       return;
                   case 16:
                       if (var1.cLevel >= 20 && (var15 = Char.g(ac[var1.nClass.classId])) != null) {
                           GameScr.chatPopup("Học sách kĩ năng");
                           Service.getInstance().useItem(var15.indexUI);
                           Thread.sleep(1000L);
                       }
                       
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 63) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(63, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 63) {
                               this.c(-1);
                               this.c(23, 1);
                               return;
                           }
                           
                           this.a(63, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 47) {
                               this.c(-1);
                               this.c(24, 1);
                               return;
                           }
                           
                           this.a(47, -1, -1, -1);
                           return;
                       }
                       break;
                   case 17:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 33) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(33, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 33) {
                               if ((var1 = Char.getMyChar()).ctaskId != 17 || var1.taskMaint.a >= var1.taskMaint.e.length - 1) {
                                   var36 = Code.a;
                                   Code.f();
                                   return;
                               }
                               
                               if (var1.e == null) {
                                   GameScr.PickNpc(17, 0, 0);
                                   Thread.sleep(2000L);
                                   return;
                               }
                               
                               if (Class_fa.a(var1.cx, var1.cy, var1.e.cx, var1.e.cy) > 200) {
                                   Class_ah.a(var1.e);
                               }
                               
                               var12 = Char.getMyChar();
                               var14 = Auto.selectSkill;
                               if (Char.isABuff) {
                                   for(var4 = 0; var4 < var12.bx.size(); ++var4) {
                                       Skill var19;
                                       if ((var19 = (Skill)var12.bx.elementAt(var4)) != null && !var19.isCooldown() && var19.template.type == 2 && (var19.template.id != 47 || var12.cHP < var12.cMaxHP * Char.es / 100)) {
                                           boolean var22 = false;
                                           
                                           for(var7 = 0; var7 < var12.by.size(); ++var7) {
                                               Class_cq var8;
                                               if ((var8 = (Class_cq)var12.by.elementAt(var7)) != null && var8.e.c == var19.template.iconId) {
                                                   var22 = true;
                                                   break;
                                               }
                                           }
                                           
                                           if (!var22) {
                                               var14 = var19;
                                               Thread.sleep(500L);
                                               break;
                                           }
                                       }
                                   }
                               }
                               
                               label789: {
                                   if (var14.template.type == 2) {
                                       Service.getInstance().r();
                                   } else {
                                       Char var17;
                                       MyVector var21;
                                       Char var34;
                                       label786: {
                                           if ((var17 = Char.getMyChar()).e != null) {
                                               var21 = GameScr.vCharInMap;
                                               
                                               for(var24 = 0; var24 < var21.size(); ++var24) {
                                                   Char var25;
                                                   if ((var25 = (Char)var21.elementAt(var24)) != null && var25.r != 14 && var25.r != 5 && var25.r != 15 && (var25.cm == 3 || var17.cm == 3 || var25.cm == 1 && var17.cm == 1 || var17.da >= 0 && var17.da == var25.charID || var17.cz >= 0 && var17.cz == var25.charID) && Class_fa.a(var25.cx, var25.cy, var17.e.cx, var17.e.cy) < 200) {
                                                       var34 = var25;
                                                       break label786;
                                                   }
                                               }
                                           }
                                           
                                           var34 = null;
                                       }
                                       
                                       var17 = var34;
                                       if (var34 != null) {
                                           if (Class_fa.a(var17.cx, var17.cy, var12.e.cx, var12.e.cy) < 200 && (Class_fa.e(var12.cx - var17.cx) > var14.dx || Class_fa.e(var12.cy - var17.cy) > var14.dy)) {
                                               Class_ah.a(var17);
                                           }
                                           
                                           Service.getInstance().g(var14.template.id);
                                           Auto.v.removeAllElements();
                                           Auto.w.removeAllElements();
                                           Auto.w.addElement(var17);
                                           Service.getInstance().a(Auto.v, Auto.w, 2);
                                       } else {
                                           Mob var35;
                                           label744: {
                                               if ((var17 = Char.getMyChar()).e != null) {
                                                   var21 = GameScr.vMobAttack;
                                                   
                                                   for(var24 = 0; var24 < var21.size(); ++var24) {
                                                       Mob var26;
                                                       if ((var26 = (Mob)var21.elementAt(var24)) != null && var26.c > 0 && var26.h != 0 && var26.h != 1 && Class_fa.a(var26.e, var26.f, var17.e.cx, var17.e.cy) < 200) {
                                                           var35 = var26;
                                                           break label744;
                                                       }
                                                   }
                                               }
                                               
                                               var35 = null;
                                           }
                                           
                                           Mob var23 = var35;
                                           if (var35 == null) {
                                               break label789;
                                           }
                                           
                                           if (Class_fa.a(var23.e, var23.f, var12.e.cx, var12.e.cy) < 200 && (Class_fa.e(var12.cx - var23.e) > var14.dx || Class_fa.e(var12.cy - var23.f) > var14.dy)) {
                                               this.c(var23);
                                           }
                                           
                                           Service.getInstance().g(var14.template.id);
                                           Auto.v.removeAllElements();
                                           Auto.w.removeAllElements();
                                           Auto.v.addElement(var23);
                                           Service.getInstance().a(Auto.v, Auto.w, 1);
                                       }
                                   }
                                   
                                   if (System.currentTimeMillis() - var14.lastTimeUseThisSkill >= (long)var14.coolDown) {
                                       var14.lastTimeUseThisSkill = System.currentTimeMillis();
                                       var14.paintCanNotUseSkill = true;
                                       if (!Code.ae) {
                                           var12.b(GameScr.skillPaints[var14.template.id], 0);
                                       }
                                   }
                               }
                               
                               if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.et / 100) {
                                   Char.getMyChar().e(17);
                               }
                               
                               if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.es / 100) {
                                   var11 = (int)(System.currentTimeMillis() / 1000L);
                                   
                                   for(var2 = 0; var2 < Char.getMyChar().by.size(); ++var2) {
                                       if ((var13 = (Class_cq)Char.getMyChar().by.elementAt(var2)).e.a == 21 && var13.c - (var11 - var13.b) >= 2) {
                                           return;
                                       }
                                   }
                                   
                                   Char.getMyChar().e(16);
                                   return;
                               }
                           } else {
                               this.a(33, super.i, -1, -1);
                           }
                           
                           return;
                       }
                       break;
                   case 18:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 50) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(50, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 50) {
                               this.c(216);
                               this.c(26, 1);
                               return;
                           }
                           
                           this.a(50, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 11) {
                               this.c(217);
                               this.c(27, 1);
                               return;
                           }
                           
                           this.a(11, -1, -1, -1);
                           return;
                       }
                       break;
                   case 19:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 11) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(11, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a != 1) {
                           break;
                       }
                       
                       if (TileMap.mapID == 63) {
                           Char.c(1691, 336);
                           var4 = 0;
                           
                           while(true) {
                               for(var5 = 0; var5 < Char.getMyChar().arrItemBag.length; ++var5) {
                                   var6 = Char.getMyChar().arrItemBag[var5];
                                   if (var6 != null && var6.template.id == 219) {
                                       Service.getInstance().useItem(var6.indexUI);
                                       ++var4;
                                       GameScr.chatPopup("Lấy Được " + var4 + " bình nước");
                                       Thread.sleep(4000L);
                                   }
                               }
                           }
                       }
                       
                       this.a(63, -1, -1, -1);
                   case 22:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 35) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(35, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 35) {
                               this.c(230);
                               this.c(33, 1);
                               return;
                           }
                           
                           this.a(35, -1, -1, -1);
                           return;
                       }
                       
                       return;
                   case 20:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 50) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(50, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID != 74) {
                               this.a(8, -2, -1, -1);
                               long var10000 = 5000L;
                               GameScr.PickNpc(15, 1, 0);
                               return;
                           }
                           
                           this.c(69, -1);
                           this.c(221);
                           if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP / 2) {
                               Char.getMyChar().e(17);
                           }
                           
                           if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * 3 / 4) {
                               var11 = (int)(System.currentTimeMillis() / 1000L);
                               
                               for(var2 = 0; var2 < Char.getMyChar().by.size(); ++var2) {
                                   if ((var13 = (Class_cq)Char.getMyChar().by.elementAt(var2)).e.a == 21 && var13.c - (var11 - var13.b) >= 2) {
                                       return;
                                   }
                               }
                               
                               Char.getMyChar().e(16);
                               return;
                           }
                       }
                       break;
                   case 21:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 12) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(12, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 12) {
                               this.c(-1);
                               this.c(30, 1);
                               return;
                           }
                           
                           this.a(12, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 34) {
                               this.c(-1);
                               this.c(31, 1);
                               return;
                           }
                           
                           this.a(34, -1, -1, -1);
                           return;
                       }
                       
                       return;
                   case 23:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 35) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(35, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 78) {
                               this.c(232);
                               this.c(-1, -1);
                               return;
                           }
                           
                           this.a(35, -1, -1, -1);
                           Char.c(1816, 432);
                           
                           for(var5 = 0; var5 < Char.getMyChar().arrItemBag.length; ++var5) {
                               var6 = Char.getMyChar().arrItemBag[var5];
                               if (var6 != null && var6.template.id == 231) {
                                   Service.getInstance().useItem(var6.indexUI);
                               }
                           }
                           
                           Thread.sleep(2000L);
                           return;
                       }
                       
                       return;
                   case 24:
                       return;
                   case 25:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 13) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(13, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 13) {
                               this.c(-1);
                               this.c(37, 1);
                               return;
                           }
                           
                           this.a(13, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 52) {
                               this.c(-1);
                               this.c(38, 1);
                               return;
                           }
                           
                           this.a(52, -1, -1, -1);
                           return;
                       }
                       
                       return;
                   case 26:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 13) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(13, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 64) {
                               this.c(236);
                               this.c(1, 1);
                               return;
                           }
                           
                           this.a(64, -1, -1, -1);
                           return;
                       }
                       
                       return;
                   case 27:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 13) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(13, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 14) {
                               this.c(238);
                               this.c(41, 1);
                               return;
                           }
                           
                           this.a(14, -1, -1, -1);
                           return;
                       }
                       
                       return;
                   case 28:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 14) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           } else {
                               this.a(14, -1, -1, -1);
                               return;
                           }
                       } else if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 14) {
                               this.c(-1);
                               this.c(42, 1);
                               return;
                           } else {
                               this.a(14, -1, -1, -1);
                               return;
                           }
                       } else if (var1.taskMaint.a == 2) {
                           if (TileMap.mapID == 15) {
                               this.c(-1);
                               this.c(43, 1);
                               return;
                           } else {
                               this.a(15, -1, -1, -1);
                               return;
                           }
                       } else {
                           return;
                       }
                   case 29:
                       if (var1.taskMaint.a == 0) {
                           if (TileMap.mapID == 15) {
                               this.c(-1);
                               this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(15, -1, -1, -1);
                           return;
                       }
                       
                       if (var1.taskMaint.a == 1) {
                           if (TileMap.mapID == 15) {
                               this.c(-1);
                               this.c(44, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                               return;
                           }
                           
                           this.a(15, -1, -1, -1);
                           return;
                       }
                       
                       return;
               }} catch (InterruptedException ex) {
               
           }
 
       }
    }
 
    public String toString() {
       return "Auto Nhiệm Vụ 50";
    }
 }
 