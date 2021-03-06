package org.scribe.model;

/**
 * Parameter object that groups OAuth config values
 * 
 * @author Pablo Fernandez
 */
public class OAuthConfig
{
  private final String apiKey;
  private final String apiSecret;
  private final Callback callback;
  private final SignatureType signatureType;
  private final String scope;
  
  public OAuthConfig(String key, String secret)
  {
    this(key, secret, null, null, null);
  }

  public OAuthConfig(String key, String secret, Callback callback, SignatureType type, String scope)
  {
    this.apiKey = key;
    this.apiSecret = secret;
    this.callback = callback != null ? callback : Callback.outOfBand();
    this.signatureType = (type != null) ? type : SignatureType.Header;
    this.scope = scope;
  }

  public String getApiKey()
  {
    return apiKey;
  }

  public String getApiSecret()
  {
    return apiSecret;
  }

  public Callback getCallback()
  {
    return callback;
  }

  public SignatureType getSignatureType()
  {
    return signatureType;
  }

  public String getScope()
  {
    return scope;
  }

  public boolean hasScope()
  {
    return scope != null;
  }
}