
// Source code is decompiled from a .class file using FernFlower decompiler.
public class Class_cn {
    public static Class_cn a = new Class_cn();
    public static Code b = new Code();
    public static boolean c;
    public static short d = 136;
 
    public Class_cn() {
    }
 
    public final boolean a(String var1) {
       int var7 = 0;
       StringBuffer var8 = new StringBuffer();
       StringBuffer var9 = new StringBuffer();
 
       int var10;
       label228:
       for(var10 = 0; var10 < var1.length(); ++var10) {
          char var11;
          if ((var11 = var1.charAt(var10)) >= '0' && var11 <= '9' || var11 == ' ') {
             while(true) {
                if (var10 >= var1.length() || (var11 = var1.charAt(var10)) < '0' || var11 > '9') {
                   break label228;
                }
 
                var9.append((char)var11);
                ++var10;
             }
          }
 
          var8.append((char)var11);
       }
 
       String var5 = var8.toString().toLowerCase();
       if (var9.length() > 0) {
          try {
             var7 = Integer.parseInt(var9.toString());
          } catch (Exception var12) {
          }
       }
 
       if (var1.equals("hsl")) {
          GameScr.chatPopup((c ? "Tắt" : "Bật") + " Auto Hồi Sinh Lượng");
          c = !c;
          return true;
       } else {
          int var6;
          if (var5.equals("cnl")) {
             if (Code.b == null) {
                GameScr.chatPopup("Bạn chưa up nhuyên liệu");
             } else {
                var6 = Class_gi.e - Class_gi.a;
                var7 = Class_gi.f - Class_gi.b;
                int var3 = Class_gi.g - Class_gi.c;
                int var4 = Class_gi.h - Class_gi.d;
                var10 = (int)((System.currentTimeMillis() - Code.b.o) / 1000L);
                GameScr.chatPopup("Up " + ItemTemplateManager.get((short)454).name + " : " + var6 + " " + ItemTemplateManager.get((short)455).name + " : " + var7 + " " + ItemTemplateManager.get((short)456).name + " : " + var3 + " " + ItemTemplateManager.get((short)457).name + " : " + var4 + " trong " + NinjaUtil.b(var10) + " TB / 1h: " + ItemTemplateManager.get((short)454).name + " = " + 3600 * var6 / var10 + " " + ItemTemplateManager.get((short)455).name + " = " + 3600 * var7 / var10 + " " + ItemTemplateManager.get((short)456).name + " = " + 3600 * var3 / var10 + " " + ItemTemplateManager.get((short)457).name + " = " + 3600 * var4 / var10);
             }
 
             return true;
          } else if (var1.equals("full")) {
             Code.s.removeAllElements();
             Code.t.removeAllElements();
             var6 = 0;
 
             for(var7 = 0; var7 < GameScr.vMobAttack.size(); ++var7) {
                if (!((Mob)GameScr.vMobAttack.elementAt(var7)).y) {
                   Code.s.addElement(new Integer(((Mob)GameScr.vMobAttack.elementAt(var7)).i));
                   Code.t.addElement(new Integer(((Mob)GameScr.vMobAttack.elementAt(var7)).j));
                   if (Char.em) {
                      Service.getInstance().k("avt " + ((Mob)GameScr.vMobAttack.elementAt(var7)).i + " " + ((Mob)GameScr.vMobAttack.elementAt(var7)).j);
                   }
 
                   ++var6;
                }
             }
 
             GameScr.chatPopup("Thêm toàn bộ vị trí quái trong map!");
             return true;
          } else if (var1.startsWith("xem")) {
             GameScr.chatPopup(ItemTemplateManager.get((short)607).name + " : " + Class_gi.e + " " + ItemTemplateManager.get((short)608).name + " : " + Class_gi.f + " " + ItemTemplateManager.get((short)609).name + " : " + Class_gi.g + " " + ItemTemplateManager.get((short)610).name + " : " + Class_gi.h);
             return true;
          } else if (var1.startsWith("map")) {
             GameScr.chatPopup("" + TileMap.mapID);
             return true;
          } else if (var1.startsWith("tt")) {
             if (TileMap.mapID == 22) {
                GameScr.h(12);
                Service.getInstance().getTask(12, 3);
             }
 
             return true;
          } else if (var1.startsWith("vdmq")) {
             Code.j[0] = 454;
             Code.j[1] = 455;
             Code.j[2] = 456;
             Code.j[3] = 457;
             Code.j[4] = 573;
             Code.j[5] = 574;
             Code.j[6] = 575;
             Code.j[7] = 38;
             Code.j[8] = 383;
             Code.j[9] = 384;
             GameScr.chatPopup("Thêm: " + ItemTemplateManager.get(Code.j[0]).name + "," + ItemTemplateManager.get(Code.j[1]).name + "," + ItemTemplateManager.get(Code.j[2]).name + "," + ItemTemplateManager.get(Code.j[3]).name + "," + ItemTemplateManager.get(Code.j[4]).name + "," + ItemTemplateManager.get(Code.j[5]).name + "," + ItemTemplateManager.get(Code.j[6]).name + "," + ItemTemplateManager.get(Code.j[7]).name + "," + ItemTemplateManager.get(Code.j[8]).name + "," + ItemTemplateManager.get(Code.j[9]).name + ",");
             return true;
          } else if (var1.equals("nhan")) {
             if (TileMap.mapID != Class_fj.d) {
                GameScr.chatPopup("Hãy Về " + TileMap.mapNames[Class_fj.d]);
             } else {
                if (TileMap.zoneID != Class_fj.e) {
                   GameScr.getInstance().j(Class_fj.e);
                   InfoMe.a("Chát lại: nhan để bật auto nhận đồ!", 50, mFont.tahoma_7_yellow);
                }
 
                if (TileMap.zoneID == Class_fj.e) {
                   Code.a(new Class_fj());
                }
             }
 
             return true;
          } else if (var5.equals("gdn")) {
             if (Char.getMyChar().charFocus != null) {
                Code.a(new Class_fs(Char.getMyChar().charFocus.charName));
                GameScr.chatPopup("Đã gửi lời mời gd vật phẩm ! ");
             } else {
                GameScr.chatPopup("Hãy chỉ vào đối phương <VPGD>");
             }
 
             return true;
          } else if (var5.equals("gds")) {
             Class_fr.a = 455;
             if (Char.getMyChar().charFocus != null) {
                Code.a(new Class_fr(Char.getMyChar().charFocus.charName));
                GameScr.chatPopup("Đã gửi lời mời gd vật phẩm ! ");
             } else {
                GameScr.chatPopup("Hãy chỉ vào đối phương <VPGD>");
             }
 
             return true;
          } else if (var5.equals("gdt")) {
             Class_fr.a = 456;
             if (Char.getMyChar().charFocus != null) {
                Code.a(new Class_fr(Char.getMyChar().charFocus.charName));
                GameScr.chatPopup("Đã gửi lời mời gd vật phẩm ! ");
             } else {
                GameScr.chatPopup("Hãy chỉ vào đối phương <VPGD>");
             }
 
             return true;
          } else if (var5.equals("gd")) {
             Class_fr.a = (short)var7;
             if (Char.getMyChar().charFocus != null) {
                Code.a(new Class_fr(Char.getMyChar().charFocus.charName));
                GameScr.chatPopup("Đã gửi lời mời gd vật phẩm ! ");
             } else {
                GameScr.chatPopup("Hãy chỉ vào đối phương <VPGD>");
             }
 
             return true;
          } else if (var5.equals("ctt")) {
             Class_fr.a = 454;
             if (Char.getMyChar().charFocus != null) {
                Code.a(new Class_fr(Char.getMyChar().charFocus.charName));
                GameScr.chatPopup("Đã gửi lời mời gd vật phẩm ! ");
             } else {
                GameScr.chatPopup("Hãy chỉ vào đối phương <VPGD>");
             }
 
             return true;
          } else if (var5.equals("gdc")) {
             Class_fr.a = 457;
             if (Char.getMyChar().charFocus != null) {
                Code.a(new Class_fr(Char.getMyChar().charFocus.charName));
                GameScr.chatPopup("Đã gửi lời mời gd vật phẩm ! ");
             } else {
                GameScr.chatPopup("Hãy chỉ vào đối phương <VPGD>");
             }
 
             return true;
          } else if (!var1.equals("gui")) {
             if (var1.equals("check")) {
                GameScr.chatPopup("" + Class_fl.e() + "Task: " + Char.getMyChar().ctaskId);
                return true;
             } else if (var1.equals("kb")) {
                for(var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                   Char var13;
                   if ((var13 = (Char)GameScr.vCharInMap.elementAt(var6)) != null) {
                      Service.getInstance().a(var13.charName);
                   }
                }
 
                return true;
             } else if (var1.equals("ktg")) {
                Class_fm.b = !Class_fm.b;
                (new Thread(new Class_fm())).start();
                GameScr.chatPopup(Class_fm.b ? "Auto Mua Bán KTG : Bật" : "Auto Mua Bán KTG : Tắt");
                return true;
             } else if (var1.startsWith("ct")) {
                if (TileMap.mapID == 22) {
                   GameScr.h(12);
                   Service.getInstance().getTask(12, 4);
                }
 
                return true;
             } else {
                return b.f(var1);
             }
          } else {
             GameScr.chatPopup("Auto Send");
             if (Class_fj.a != null) {
                for(var7 = 0; var7 < Code.c(Class_fj.a, ",").length; ++var7) {
                   Code.a(new Class_fl(Class_fj.d, Class_fj.e, Code.c(Class_fj.a, ",")[var7]));
                }
             }
 
             return true;
          }
       }
    }
 }
 