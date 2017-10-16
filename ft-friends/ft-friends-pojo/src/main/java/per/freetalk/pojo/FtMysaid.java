package per.freetalk.pojo;

import java.util.Date;

public class FtMysaid {
    private Long id;

    private Long upid;

    private Long uiid;

    private Long commentId;

    private Date date;

    private String said;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUpid() {
        return upid;
    }

    public void setUpid(Long upid) {
        this.upid = upid;
    }

    public Long getUiid() {
        return uiid;
    }

    public void setUiid(Long uiid) {
        this.uiid = uiid;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSaid() {
        return said;
    }

    public void setSaid(String said) {
        this.said = said == null ? null : said.trim();
    }
}