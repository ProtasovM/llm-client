package ee.carlrobert.llm.client.openai.completion.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a tool result message in the conversation.
 * This message type is sent back to the model after executing a tool call.
 */
public class OpenAIChatCompletionToolMessage implements OpenAIChatCompletionMessage {

  private final String name;
  @JsonProperty("tool_call_id")
  private final String callId;
  private final String content;

  public OpenAIChatCompletionToolMessage(String callId, String name, String content) {
    this.callId = callId;
    this.name = name;
    this.content = content;
  }

  public String getCallId() {
    return callId;
  }

  public String getName() {
    return name;
  }

  public String getContent() {
    return content;
  }

  public String getRole() {
    return "tool";
  }
}