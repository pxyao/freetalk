package per.freetalk.pojo;

import java.io.Serializable;

public class FtCommented implements Serializable {
    private Long id;

    private Long uid;

    private Long sid;

    private Long upid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getUpid() {
        return upid;
    }

    public void setUpid(Long upid) {
        this.upid = upid;
    }
}