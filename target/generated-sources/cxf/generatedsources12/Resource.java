/**
 * Created by Apache CXF WadlToJava code generator
**/
package generatedsources12;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import com.uhc.optum.claims.institutionalclaimhistory.v1.InstitutionalClaimHistoryRequest;
import com.uhc.optum.claims.institutionalclaimhistory.v1.InstitutionalClaimHistoryResponse;

@Path("/")
public interface Resource {

    @DELETE
    @Produces({"application/json", "application/xml" })
    @Path("/ping")
    Response deletePing();

    @GET
    @Produces({"application/json", "application/xml" })
    @Path("/ping")
    Response getPing();

    @POST
    @Produces({"application/json", "application/xml" })
    @Path("/ping")
    Response postPing();

    @PUT
    @Produces({"application/json", "application/xml" })
    @Path("/ping")
    Response putPing();

    @POST
    @Consumes({"application/json", "application/xml" })
    @Produces({"application/json", "application/xml" })
    @Path("/read")
    InstitutionalClaimHistoryResponse postRead(InstitutionalClaimHistoryRequest institutionalclaimhistoryrequest);

}