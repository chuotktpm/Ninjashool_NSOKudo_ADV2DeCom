public final class Class_aj extends Auto {
    private int a;
    private int b;
    private boolean[] c;
 
    public Class_aj() {
       super.a();
       super.h = 157;
       super.j = true;
       super.i = -2;
       this.a = 199;
       this.b = 0;
       this.c = new boolean[3];
    }
 
    public final void c() {
       if (super.i()) {
          Auto.a(true);
       } else if (super.h != TileMap.mapID) {
          this.a(super.h, super.i, super.k, super.l);
       } else {
          Char var2 = Char.getMyChar();
          if (!Auto.m()) {
             label387: {
                Mob var3;
                int var5;
                Mob var6;
                if ((var3 = var2.mobFocus) == null || var3.h == 0 || !var3.y || System.currentTimeMillis() - super.x > 5000L) {
                   Class_aj var10 = this;
                   MyVector var4 = GameScr.vMobAttack;
                   var5 = 0;
 
                   Mob var10000;
                   while(true) {
                      if (var5 >= var4.size()) {
                         var10000 = null;
                         break;
                      }
 
                      if ((var6 = (Mob)var4.elementAt(var5)) != null && var6.c > 0 && var6.h != 0 && var6.h != 1 && var6.s == var10.a && var6.w == var10.b) {
                         var10000 = var6;
                         break;
                      }
 
                      ++var5;
                   }
 
                   var3 = var10000;
                   if (var10000 == null && System.currentTimeMillis() - super.x > 1000L && !this.d()) {
                      var4 = GameScr.vMobAttack;
                      var5 = 0;
 
                      boolean var18;
                      while(true) {
                         if (var5 >= var4.size()) {
                            var18 = true;
                            break;
                         }
 
                         if ((var6 = (Mob)var4.elementAt(var5)) != null && var6.c > 0 && var6.h != 0 && var6.h != 1) {
                            var18 = false;
                            break;
                         }
 
                         ++var5;
                      }
 
                      if (var18) {
                         this.c[this.a - 198] = true;
                         if (this.c[0] && this.c[1] && this.c[2]) {
                            Code var19 = Code.a;
                            Code.c();
                            break label387;
                         }
                      }
 
                      switch (this.a) {
                         case 198:
                            this.a = 199;
                            super.h = 157;
                            if (this.b == 0) {
                               this.b = 4;
                            }
                            break label387;
                         case 199:
                            this.a = 200;
                            super.h = 158;
                            break label387;
                         case 200:
                            this.a = 198;
                            super.h = 159;
                         default:
                            break label387;
                      }
                   }
                }
 
                if (Char.em && GameScr.vParty.size() > 0 && var2.nClass.classId == 6 && var2.cHP > 0) {
                   for(int var11 = 0; var11 < var2.bx.size(); ++var11) {
                      Skill var13;
                      if ((var13 = (Skill)var2.bx.elementAt(var11)) != null && var13.template.type == 4) {
                         if (!var13.isCooldown()) {
                            for(int var14 = 0; var14 < GameScr.vParty.size(); ++var14) {
                               Party var7;
                               if ((var7 = (Party)GameScr.vParty.elementAt(var14)).a != var2.charID && var7.f != null && var7.f.cHP <= 0) {
                                   try {
                                       Char var8 = var7.f;
                                       if (Math.abs(var2.cx - var8.cx) > 50 || Math.abs(var2.cy - var8.cy) > 50) {
                                           Char.c(var8.cx, var8.cy);
                                       }
                                       
                                       Thread.sleep(500L);
                                       Service.getInstance().buffLive(var7.a);
                                       var13.lastTimeUseThisSkill = System.currentTimeMillis();
                                       var13.paintCanNotUseSkill = true;
                                       var2.b(GameScr.skillPaints[var13.template.id], 0);
                                       Thread.sleep(1000L);
                                       break label387;
                                   } catch (InterruptedException ex) {
                                       
                                   }
                               }
                            }
                         }
                         break;
                      }
                   }
                }
 
                if (Auto.selectSkill != null && var3 != null && var3.y && var3.s == this.a && var3.w == this.b) {
                   Skill var12;
                   if ((var12 = Auto.selectSkill).isCooldown() && Char.isABuff) {
                      label371: {
                          try {
                              var5 = 0;
                              
                              Skill var15;
                              label266:
                              while(true) {
                                  if (var5 >= var2.bx.size()) {
                                      break label371;
                                  }
                                  
                                  if ((var15 = (Skill)var2.bx.elementAt(var5)) != null && System.currentTimeMillis() - var15.lastTimeUseThisSkill >= (long)var15.coolDown - 300L) {
                                      if (var15.template.type == 2) {
                                          if ((var2.d == null && Char.dk || var15.template.id < 67 || var15.template.id > 72) && (Char.dl || var15.template.id != 31) && (var15.template.id != 15 || var2.cHP < var2.cMaxHP * Char.es / 100)) {
                                              int var16 = (int)(System.currentTimeMillis() / 1000L);
                                              int var17 = 0;
                                              
                                              while(true) {
                                                  if (var17 >= var2.by.size()) {
                                                      break label266;
                                                  }
                                                  
                                                  Class_cq var9;
                                                  if ((var9 = (Class_cq)var2.by.elementAt(var17)) != null && (var9.e.c == var15.template.iconId || var15.template.id == 58 && var9.e.b == 7) && var9.c - (var16 - var9.b) >= 2) {
                                                      break;
                                                  }
                                                  
                                                  ++var17;
                                              }
                                          }
                                      } else if (var15.template.type == 3 && var3.w == 0 && var3.c > var3.d / 2) {
                                          if (var15.template.id != 4 || Char.dm && var2.cHP < var2.cMaxHP * Char.es / 100) {
                                              break;
                                          }
                                      } else if ((var15.template.id == 7 || var15.template.id == 16 || var15.template.id == 25 || var15.template.id == 34 || var15.template.id == 43) && (var3.w != 0 || var3.c >= var3.d / 2) && (var15.template.id != 7 && var15.template.id != 16 || !var3.p) && (var15.template.id != 25 && var15.template.id != 34 || var3.q) && (var15.template.id != 43 || var3.r)) {
                                          break;
                                      }
                                  }
                                  
                                  ++var5;
                              }
                              
                              var12 = var15;
                              Thread.sleep(500L);
                          } catch (InterruptedException ex) {
                              
                          }
                      }
                   }
 
                   if ((var12.template.type == 1 || var12.template.type == 3) && (Class_fa.e(var2.cx - var3.i) > var12.dx || Class_fa.e(var2.cy - var3.j) > var12.dy)) {
                      this.c(var3);
                   }
 
                   Service.getInstance().g(var12.template.id);
                   if (var12.template.type == 2) {
                      Service.getInstance().r();
                   } else {
                      Auto.v.removeAllElements();
                      Auto.w.removeAllElements();
                      if (var3 != null) {
                         Auto.v.addElement(var3);
 
                         for(var5 = 0; var5 < GameScr.vMobAttack.size() && Auto.v.size() + Auto.w.size() < var12.maxFight; ++var5) {
                            if ((var6 = (Mob)GameScr.vMobAttack.elementAt(var5)).h != 0 && var6.h != 1 && !var6.equals(var3) && var3.i - 100 <= var6.i && var6.i <= var3.i + 100 && var3.j - 50 <= var6.j && var6.j <= var3.j + 50) {
                               Auto.v.addElement(var6);
                            }
                         }
                      }
 
                      Service.getInstance().a(Auto.v, Auto.w, 1);
                   }
 
                   if (System.currentTimeMillis() - var12.lastTimeUseThisSkill >= (long)var12.coolDown) {
                      var12.lastTimeUseThisSkill = System.currentTimeMillis();
                      var12.paintCanNotUseSkill = true;
                      if (!Code.ae) {
                         var2.b(GameScr.skillPaints[var12.template.id], 0);
                      }
                   }
 
                   super.x = System.currentTimeMillis();
                   if (var12.template.id == 15) {
                       try {
                           Thread.sleep(2000L);
                       } catch (InterruptedException ex) {
                           
                       }
                   }
                }
             }
          }
 
          this.c(-1);
       }
    }
 
    public final String toString() {
       return "Hang 9x Lvl " + this.b;
    }
 }
 