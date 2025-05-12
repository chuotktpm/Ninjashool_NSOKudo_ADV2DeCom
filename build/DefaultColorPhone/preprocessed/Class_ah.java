
public final class Class_ah extends Auto {
    public Class_ah() {
       super.a();
       super.i = TileMap.zoneID;
    }
 
    public static void a(Char var0) {
       if (var0 != null) {
          Char var1 = Char.getMyChar();
          Char.c(var0.cx, var0.cy);
          var1.charFocus = var0;
           try {
               Thread.sleep(100L);
           } catch (InterruptedException ex) {
               
           }
       }
 
    }
 
    protected final void c() {
       if (Char.getMyChar().cHP <= 0) {
          Auto.a(true);
       } else {
          if (TileMap.mapID == 33) {
             Char var1;
             if ((var1 = Char.getMyChar()).ctaskId != 17 || var1.taskMaint.a >= var1.taskMaint.e.length - 1) {
                Code var19 = Code.a;
                Code.f();
                return;
             }
 
             if (var1.e == null) {
                 try {
                     GameScr.PickNpc(17, 0, 0);
                     Thread.sleep(2000L);
                     return;
                 } catch (InterruptedException ex) {
                     
                 }
             }
 
             if (Class_fa.a(var1.cx, var1.cy, var1.e.cx, var1.e.cy) > 200) {
                a(var1.e);
             }
 
             Char var2 = Char.getMyChar();
             Skill var3 = Auto.selectSkill;
             if (Char.isABuff) {
                for(int var4 = 0; var4 < var2.bx.size(); ++var4) {
                   Skill var5;
                   if ((var5 = (Skill)var2.bx.elementAt(var4)) != null && !var5.isCooldown() && var5.template.type == 2 && (var5.template.id != 47 || var2.cHP < var2.cMaxHP * Char.es / 100)) {
                      boolean var6 = false;
 
                      for(int var7 = 0; var7 < var2.by.size(); ++var7) {
                         Class_cq var8;
                         if ((var8 = (Class_cq)var2.by.elementAt(var7)) != null && var8.e.c == var5.template.iconId) {
                            var6 = true;
                            break;
                         }
                      }
 
                      if (!var6) {
                          try {
                              var3 = var5;
                              Thread.sleep(500L);
                              break;
                          } catch (InterruptedException ex) {
                              
                          }
                      }
                   }
                }
             }
 
             label173: {
                if (var3.template.type == 2) {
                   Service.getInstance().r();
                } else {
                   Char var12;
                   MyVector var13;
                   int var15;
                   Char var10000;
                   label170: {
                      if ((var12 = Char.getMyChar()).e != null) {
                         var13 = GameScr.vCharInMap;
 
                         for(var15 = 0; var15 < var13.size(); ++var15) {
                            Char var16;
                            if ((var16 = (Char)var13.elementAt(var15)) != null && var16.r != 14 && var16.r != 5 && var16.r != 15 && (var16.cm == 3 || var12.cm == 3 || var16.cm == 1 && var12.cm == 1 || var12.da >= 0 && var12.da == var16.charID || var12.cz >= 0 && var12.cz == var16.charID) && Class_fa.a(var16.cx, var16.cy, var12.e.cx, var12.e.cy) < 200) {
                               var10000 = var16;
                               break label170;
                            }
                         }
                      }
 
                      var10000 = null;
                   }
 
                   var12 = var10000;
                   if (var10000 != null) {
                      if (Class_fa.a(var12.cx, var12.cy, var2.e.cx, var2.e.cy) < 200 && (Class_fa.e(var2.cx - var12.cx) > var3.dx || Class_fa.e(var2.cy - var12.cy) > var3.dy)) {
                         a(var12);
                      }
 
                      Service.getInstance().g(var3.template.id);
                      Auto.v.removeAllElements();
                      Auto.w.removeAllElements();
                      Auto.w.addElement(var12);
                      Service.getInstance().a(Auto.v, Auto.w, 2);
                   } else {
                      Mob var18;
                      label128: {
                         if ((var12 = Char.getMyChar()).e != null) {
                            var13 = GameScr.vMobAttack;
 
                            for(var15 = 0; var15 < var13.size(); ++var15) {
                               Mob var17;
                               if ((var17 = (Mob)var13.elementAt(var15)) != null && var17.c > 0 && var17.h != 0 && var17.h != 1 && Class_fa.a(var17.e, var17.f, var12.e.cx, var12.e.cy) < 200) {
                                  var18 = var17;
                                  break label128;
                               }
                            }
                         }
 
                         var18 = null;
                      }
 
                      Mob var14 = var18;
                      if (var18 == null) {
                         break label173;
                      }
 
                      if (Class_fa.a(var14.e, var14.f, var2.e.cx, var2.e.cy) < 200 && (Class_fa.e(var2.cx - var14.e) > var3.dx || Class_fa.e(var2.cy - var14.f) > var3.dy)) {
                         this.c(var14);
                      }
 
                      Service.getInstance().g(var3.template.id);
                      Auto.v.removeAllElements();
                      Auto.w.removeAllElements();
                      Auto.v.addElement(var14);
                      Service.getInstance().a(Auto.v, Auto.w, 1);
                   }
                }
 
                if (System.currentTimeMillis() - var3.lastTimeUseThisSkill >= (long)var3.coolDown) {
                   var3.lastTimeUseThisSkill = System.currentTimeMillis();
                   var3.paintCanNotUseSkill = true;
                   if (!Code.ae) {
                      var2.b(GameScr.skillPaints[var3.template.id], 0);
                   }
                }
             }
 
             if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.et / 100) {
                Char.getMyChar().e(17);
             }
 
             if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.es / 100) {
                int var9 = (int)(System.currentTimeMillis() / 1000L);
 
                for(int var10 = 0; var10 < Char.getMyChar().by.size(); ++var10) {
                   Class_cq var11;
                   if ((var11 = (Class_cq)Char.getMyChar().by.elementAt(var10)).e.a == 21 && var11.c - (var9 - var11.b) >= 2) {
                      return;
                   }
                }
 
                Char.getMyChar().e(16);
                return;
             }
          } else {
             this.a(33, super.i, -1, -1);
          }
 
       }
    }
 
    public final String toString() {
       return "Dẫn trẻ";
    }
 }
 