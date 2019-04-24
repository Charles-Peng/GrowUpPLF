package pri.growup.base.persistence;

/**
 * The Class BaseExample
 *
 * 所有Example基础类
 */
public class BaseExample {

    /** The start record. */
    protected Integer startRecord;

    /** The record num for one page. */
    protected Integer recordNumForOnePage;

    public Integer getStartRecord() {
        return startRecord;
    }

    public void setStartRecord(Integer startRecord) {
        this.startRecord = startRecord;
    }

    public Integer getRecordNumForOnePage() {
        return recordNumForOnePage;
    }

    public void setRecordNumForOnePage(Integer recordNumForOnePage) {
        this.recordNumForOnePage = recordNumForOnePage;
    }
}
