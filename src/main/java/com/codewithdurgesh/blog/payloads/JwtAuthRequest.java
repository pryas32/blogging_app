package com.codewithdurgesh.blog.payloads;

public class JwtAuthRequest {

  private String username;
  private String password;

  // Getter for username
  public String getUsername() {
    return username;
  }

  // Setter for username
  public void setUsername(String username) {
    this.username = username;
  }

  // Getter for password
  public String getPassword() {
    return password;
  }

  // Setter for password
  public void setPassword(String password) {
    this.password = password;
  }
}
