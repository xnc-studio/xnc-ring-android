package com.xnc.core;

public abstract interface ViewDelegate
{
  public abstract void handleResponse(Response paramResponse);

  public abstract void handleTaskError(Response paramResponse);
}
