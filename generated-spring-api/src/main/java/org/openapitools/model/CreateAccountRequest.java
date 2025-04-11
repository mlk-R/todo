package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateAccountRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-11T17:51:57.836378400+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CreateAccountRequest {

  private String ownerName;

  private Double initialBalance;

  public CreateAccountRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAccountRequest(String ownerName, Double initialBalance) {
    this.ownerName = ownerName;
    this.initialBalance = initialBalance;
  }

  public CreateAccountRequest ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * Get ownerName
   * @return ownerName
  */
  @NotNull 
  @Schema(name = "ownerName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ownerName")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public CreateAccountRequest initialBalance(Double initialBalance) {
    this.initialBalance = initialBalance;
    return this;
  }

  /**
   * Get initialBalance
   * @return initialBalance
  */
  @NotNull 
  @Schema(name = "initialBalance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("initialBalance")
  public Double getInitialBalance() {
    return initialBalance;
  }

  public void setInitialBalance(Double initialBalance) {
    this.initialBalance = initialBalance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAccountRequest createAccountRequest = (CreateAccountRequest) o;
    return Objects.equals(this.ownerName, createAccountRequest.ownerName) &&
        Objects.equals(this.initialBalance, createAccountRequest.initialBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerName, initialBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountRequest {\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

