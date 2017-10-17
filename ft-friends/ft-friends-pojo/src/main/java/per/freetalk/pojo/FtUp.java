package per.freetalk.pojo;

import java.io.Serializable;

public class FtUp implements Serializable {
    private Long id;

    private Long uiid;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUiid() {
        return uiid;
    }

    public void setUiid(Long uiid) {
        this.uiid = uiid;
    }
}