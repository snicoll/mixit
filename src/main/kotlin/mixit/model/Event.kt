package mixit.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document
data class Event(
        @Id val id: String,
        val start: LocalDate,
        val end: LocalDate,
        val current: Boolean = false,
        var sponsors: List<EventSponsoring> = emptyList()
) {
    var year: Int = start.year
}

data class EventSponsoring(
        val level: SponsorshipLevel,
        val sponsor: User
)

enum class SponsorshipLevel {
    GOLD,
    SILVER,
    BRONZE,
    LANYARD,
    PARTY,
    BREAKFAST,
    LUNCH,
    HOSTING,
    VIDEO,
    COMMUNITY,
    NONE
}