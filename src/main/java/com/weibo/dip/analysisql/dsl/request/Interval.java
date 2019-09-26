package com.weibo.dip.analysisql.dsl.request;

import java.io.Serializable;
import java.util.Date;

/** @author yurun */
public class Interval implements Serializable {
  private Date start;
  private Date end;

  public Interval() {}

  public Interval(Date start, Date end) {
    this.start = start;
    this.end = end;
  }

  public Date getStart() {
    return start;
  }

  public void setStart(Date start) {
    this.start = start;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
  }
}
