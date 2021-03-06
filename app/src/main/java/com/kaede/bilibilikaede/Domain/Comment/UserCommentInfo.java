package com.kaede.bilibilikaede.Domain.Comment;

import java.util.ArrayList;

/**
 * Created by asus on 2016/2/25.
 */
public class UserCommentInfo {
    private String mid;
    private String lv;//表示楼层
    private String fbid;
    private String ad_check;
    private String good;
    private String isgood;
    private String msg;
    private String device;
    private String create;
    private String create_at;
    private String reply_count;
    private String face;
    private String rank;
    private String nick;
    private String sex;
    private ArrayList<CommentReply> reply;
    private LevelInfo level_info;

    public LevelInfo getLevel_info() {
        return level_info;
    }

    public void setLevel_info(LevelInfo level_info) {
        this.level_info = level_info;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getLv() {
        return lv;
    }

    public void setLv(String lv) {
        this.lv = lv;
    }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    public String getAd_check() {
        return ad_check;
    }

    public void setAd_check(String ad_check) {
        this.ad_check = ad_check;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getIsgood() {
        return isgood;
    }

    public void setIsgood(String isgood) {
        this.isgood = isgood;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getReply_count() {
        return reply_count;
    }

    public void setReply_count(String reply_count) {
        this.reply_count = reply_count;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ArrayList<CommentReply> getReply() {
        return reply;
    }

    public void setReply(ArrayList<CommentReply> reply) {
        this.reply = reply;
    }
}
