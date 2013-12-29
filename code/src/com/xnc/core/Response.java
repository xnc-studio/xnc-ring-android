package com.xnc.core;

public class Response
{
  private Object _data;
  private ErrorCode _errorCode;
  private TaskKey _taskKey;

  public Response()
  {
    ErrorCode localErrorCode = ErrorCode.NO_ERROR;
    this._errorCode = localErrorCode;
    this._data = null;
  }

  public Response(TaskKey paramTaskKey, Object paramObject)
  {
    ErrorCode localErrorCode = ErrorCode.NO_ERROR;
    this._errorCode = localErrorCode;
    this._taskKey = paramTaskKey;
    this._data = paramObject;
  }

  public Response(TaskKey paramTaskKey, Object paramObject, ErrorCode paramErrorCode)
  {
    ErrorCode localErrorCode = ErrorCode.NO_ERROR;
    this._errorCode = localErrorCode;
    this._errorCode = paramErrorCode;
    this._data = paramObject;
  }

  public Response(Object paramObject)
  {
    ErrorCode localErrorCode = ErrorCode.NO_ERROR;
    this._errorCode = localErrorCode;
    this._data = paramObject;
  }

  public static Response constructErrorResponse(ErrorCode paramErrorCode)
  {
    Response localResponse = new Response();
    localResponse.setErrorCode(paramErrorCode);
    return localResponse;
  }

  public static Response constructErrorResponse(ErrorCode paramErrorCode, String paramString)
  {
    if ("".equals(paramString))
      paramString = null;
    Response localResponse = new Response(paramString);
    localResponse.setErrorCode(paramErrorCode);
    return localResponse;
  }

  public Object getData()
  {
    return this._data;
  }

  public ErrorCode getErrorCode()
  {
    return this._errorCode;
  }

  public TaskKey getTaskKey()
  {
    return this._taskKey;
  }

  public void setErrorCode(ErrorCode paramErrorCode)
  {
    this._errorCode = paramErrorCode;
  }

  public void setTaskKey(TaskKey paramTaskKey)
  {
    this._taskKey = paramTaskKey;
  }

  public boolean wasSuccessful()
  {
    ErrorCode localErrorCode1 = this._errorCode;
    ErrorCode localErrorCode2 = ErrorCode.NO_ERROR;
    if (localErrorCode1 == localErrorCode2) return true;
    return false;
  }
}