package pronin.oleg.zulip.data.network.models.responses

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import pronin.oleg.zulip.data.network.models.users.User

@Serializable
data class ResponseUsers(
    @SerialName("members")
    val users: List<User>,
)
