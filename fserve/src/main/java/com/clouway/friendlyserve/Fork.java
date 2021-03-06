package com.clouway.friendlyserve;

import com.google.common.base.Optional;

import java.io.IOException;

/**
 * Fork.
 *
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
public interface Fork {

  /**
   * Routes the provided request and returns response.
   *
   * @param request the request to be routed
   * @return an optional response
   * @throws IOException is thrown if IO error occurrs during processing
   */
  Optional<Response> route(Request request) throws IOException;
}
