import { EndpointRequestInit as EndpointRequestInit_1 } from "@hilla/frontend";
import client_1 from "./connect-client.default.js";
import type Team_1 from "./spaetirun/team/TeamService/Team.js";
async function getAllTeams_1(init?: EndpointRequestInit_1): Promise<Array<Team_1 | undefined> | undefined> { return client_1.call("TeamService", "getAllTeams", {}, init); }
export { getAllTeams_1 as getAllTeams };
