package com.example.module.design.memento;

/**
 * 游戏角色类
 *
 * @author lrf
 * @create 2024/4/3
 */

public class GameRole {
    
    private int vit; // 生命力
    private int atk; // 攻击力
    private int def; // 防御力

    public GameRole() {
    }

    public GameRole(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    // 初始化状态
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }
    
    // 战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
    
    // 保存状态
    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }
    
    // 回复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento stateMemento = (RoleStateMemento) memento;
        this.vit = stateMemento.getVit();
        this.atk = stateMemento.getAtk();
        this.def = stateMemento.getDef();
    }
    
    public void stateDisplay() {
        System.out.println("角色生命力：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    
    private static class RoleStateMemento extends GameRole implements Memento {

        RoleStateMemento(int vit, int atk, int def) {
            super(vit, atk, def);
        }
    }
    
}
